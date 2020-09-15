package com.qa.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {
		LOGGER.info("Would you like to read all customers or one customer?");
		LOGGER.info("ALL: Read all customers");
		LOGGER.info("ONE: Read one customer");
		String readChoice = utils.getString();
		List<Item> items = null;
		switch(readChoice.toLowerCase()) {
		case "all" :
			items = itemDAO.readAll();
			for (Item item : items) {
				LOGGER.info(item.toString());
			}
			break;
		case "one":
			LOGGER.info("Please enter the id of the customer you want to read");
			Long id = utils.getLong();
			Item getItem = itemDAO.readItem(id);
			items = new ArrayList<>();
			items.add(getItem);
			LOGGER.info(items.toString());
			return items;
		default:
			LOGGER.info("Invalid input - please try again");
			break;
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter an item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter a price");
		Double price = utils.getDouble();
		LOGGER.info("Please enter a description");
		String desc = utils.getString();
		Item item = itemDAO.create(new Item(itemName,price,desc));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter a price");
		Double price = utils.getDouble();
		LOGGER.info("Please enter a description");
		String desc = utils.getString();
		Item item = itemDAO.update(new Item(id,itemName,price,desc));
		LOGGER.info("Item Updated");
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		System.out.println("Item deleted");
		return itemDAO.delete(id);
	}

}
