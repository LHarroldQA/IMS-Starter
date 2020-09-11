package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.DBUtils;

public class ProductDAO implements Dao<Product>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public Product modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long pid = resultSet.getLong("id");
		String productName = resultSet.getString("product_name");
		Float price = resultSet.getFloat("price");
		Integer stock = resultSet.getInt("stock");
		return new Product(pid,productName,price,stock);
	}

	/**
	 * Reads all products from the database
	 * 
	 * @return A list of products
	 */
	@Override
	public List<Product> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from products");) {
			List<Product> products = new ArrayList<>();
			while (resultSet.next()) {
				products.add(modelFromResultSet(resultSet));
			}
			return products;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
	
	public Product readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM products ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Creates a product in the database
	 * 
	 * @param product - takes in a product object. pid will be ignored
	 */
	@Override
	public Product create(Product product) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("INSERT INTO products(product_name, price, stock) values('" + product.getProductName()
					+ "','" + product.getPrice() + "'," + product.getStock() + "')");
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public Product readProduct(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM products where id = " + id);) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Updates a product in the database
	 * 
	 * @param product - takes in a customer object, the pid field will be used to
	 *                 update that product in the database
	 * @return
	 */
	@Override
	public Product update(Product product) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("update products set product_name ='" + product.getProductName() + "', price ='"
					+ product.getPrice() + "', stock = '" + product.getStock() + "' where id =" + product.getPid());
			return readProduct(product.getPid());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Deletes a product in the database
	 * 
	 * @param pid - pid of the product
	 */
	@Override
	public int delete(long pid) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate("delete from products where pid = " + pid);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}
}
