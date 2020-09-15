package com.qa.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class CustomerController implements CrudController<Customer> {

	public static final Logger LOGGER = LogManager.getLogger();

	private CustomerDAO customerDAO;
	private Utils utils;

	public CustomerController(CustomerDAO customerDAO, Utils utils) {
		super();
		this.customerDAO = customerDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Customer> readAll() {
		LOGGER.info("Would you like to read all customers or one customer?");
		LOGGER.info("ALL: Read all customers");
		LOGGER.info("ONE: Read one customer");
		String readChoice = utils.getString();
		List<Customer> customers = null;
		switch(readChoice.toLowerCase()) {
		case "all" :
			customers = customerDAO.readAll();
			for (Customer customer : customers) {
				LOGGER.info(customer.toString());
			}
			break;
		case "one":
			LOGGER.info("Please enter the id of the customer you want to read");
			Long id = utils.getLong();
			Customer getCustomer = customerDAO.readCustomer(id);
			customers = new ArrayList<>();
			customers.add(getCustomer);
			LOGGER.info(customers.toString());
			return customers;
		default:
			LOGGER.info("Invalid input - please try again");
			break;
		}
		return customers;
	}
//		List<Customer> customers = customerDAO.readAll();
//		for (Customer customer : customers) {
//			LOGGER.info(customer.toString());
//		}
//		return customers;


	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Customer create() {
		LOGGER.info("Please enter a first name");
		String firstName = utils.getString();
		LOGGER.info("Please enter a surname");
		String surname = utils.getString();
		Customer customer = customerDAO.create(new Customer(firstName, surname));
		LOGGER.info("Customer created");
		return customer;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Customer update() {
		LOGGER.info("Please enter the id of the customer you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a first name");
		String firstName = utils.getString();
		LOGGER.info("Please enter a surname");
		String surname = utils.getString();
		Customer customer = customerDAO.update(new Customer(id, firstName, surname));
		LOGGER.info("Customer Updated");
		return customer;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long id = utils.getLong();
		return customerDAO.delete(id);
	}

}
