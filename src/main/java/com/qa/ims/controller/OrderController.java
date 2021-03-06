package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order>{
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
			}
		return orders;
		}

	@Override
	public Order create() {
		LOGGER.info("Please enter a customer id");
		Long customerId = utils.getLong();
		LOGGER.info("Please enter an address");
		String address = utils.getString();
		Order order = orderDAO.create(new Order(customerId,address));
		LOGGER.info("Item created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a customer id");
		Long customerId = utils.getLong();
		LOGGER.info("Please enter an address");
		String address = utils.getString();
		Order order = orderDAO.update(new Order(id,customerId,address));
		LOGGER.info("Item Updated");
		return order;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		System.out.println("Item deleted");
		return orderDAO.delete(id);
	}
}
