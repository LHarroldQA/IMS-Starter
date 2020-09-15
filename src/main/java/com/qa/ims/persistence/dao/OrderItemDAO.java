package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.DBUtils;

public class OrderItemDAO implements Dao<OrderItem>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public OrderItem modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id");
		Long orderId = resultSet.getLong("order_id");
		Long itemId = resultSet.getLong("item_id");
		Long quantity = resultSet.getLong("quantity");
		Double orderPrice = resultSet.getDouble("order_price");
		return new OrderItem(id,orderId,itemId,quantity,orderPrice);
	}

	@Override
	public List<OrderItem> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select orderitems.*,ROUND((items.price*orderitems.quantity),2) as order_price from orderitems join items on orderitems.item_id = items.id;");) {
			//SELECT * from orderitems
			List<OrderItem> orderItems = new ArrayList<>();
			while (resultSet.next()) {
				orderItems.add(modelFromResultSet(resultSet));
			}
			return orderItems;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
	
	public List<OrderItem> readAll(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select orderitems.*,ROUND((items.price*orderitems.quantity),2) as order_price from orderitems "
						+ "join items on orderitems.item_id = items.id where orderitems.order_id="+ id);) {
			//SELECT * from orderitems
			List<OrderItem> orderItems = new ArrayList<>();
			while (resultSet.next()) {
				orderItems.add(modelFromResultSet(resultSet));
			}
			return orderItems;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
	public OrderItem readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select orderitems.*,ROUND((items.price*orderitems.quantity),2) as order_price from orderitems"
						+ " join items on orderitems.item_id = items.id order by id desc limit 1;");) {
			//SELECT * from orderitems ORDER BY id DESC LIMIT 1
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public OrderItem create(OrderItem orderItem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("INSERT INTO orderitems(order_id,item_id,quantity) values('" + orderItem.getOrderId()
					+ "','" + orderItem.getItemId() + "','" + orderItem.getQuantity() + "')");
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public OrderItem readOrderItem(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select orderitems.*,ROUND((items.price*orderitems.quantity),2) as order_price from orderitems "
						+ "join items on orderitems.item_id = items.id where orderitems.order_id =" + id);) {
			//select * from orderitems where id = + id
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public OrderItem update(OrderItem orderItem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("update orderitems set order_id ='" + orderItem.getOrderId() + "', item_id ='"
					+ orderItem.getItemId() + "',quantity ='"+ orderItem.getQuantity() + "' where id =" + orderItem.getId());
			return readOrderItem(orderItem.getId());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate("delete from orderitems where id = " + id);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

}
