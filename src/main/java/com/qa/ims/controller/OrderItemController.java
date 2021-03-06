package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;


public class OrderItemController implements CrudController<OrderItem>{
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderItemDAO orderItemDAO;
	private Utils utils;

	public OrderItemController(OrderItemDAO orderItemDAO, Utils utils) {
		super();
		this.orderItemDAO = orderItemDAO;
		this.utils = utils;
	}

	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> orderItems = orderItemDAO.readAll();
			for (OrderItem orderItem : orderItems) {
				LOGGER.info(orderItem.toString());
			}
		return orderItems;
	}
	
	@Override
	public OrderItem create() {
		LOGGER.info("Please enter an order id");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter an item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		OrderItem orderItem = orderItemDAO.create(new OrderItem(orderId,itemId,quantity));
		LOGGER.info("Item created");
		return orderItem;
	}

	@Override
	public OrderItem update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter an order id");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter an item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		OrderItem orderItem = orderItemDAO.update(new OrderItem(id,orderId,itemId,quantity));
		LOGGER.info("Item Updated");
		return orderItem;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the orderitem you would like to delete");
		Long id = utils.getLong();
		System.out.println("Item deleted");
		return orderItemDAO.delete(id);
	}

}
