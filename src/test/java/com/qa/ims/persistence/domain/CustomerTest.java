package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Customer.class).verify();
	}
	
	@Test
	public void customerFirstNameTest() {
		Customer customer = new Customer("liam","harrold");
		assertEquals("liam",customer.getFirstName());
	}
	
	@Test
	public void customerSurnameTest() {
		Customer customer = new Customer("liam","harrold");
		assertEquals("harrold",customer.getSurname());
	}

	@Test
	public void customerSetFirstNameTest() {
		Customer customer = new Customer("liam","harrold");
		customer.setFirstName("harry");
		assertEquals("harry",customer.getFirstName());
	}
	
	@Test
	public void customerSetSurnameTest() {
		Customer customer = new Customer("liam","harrold");
		customer.setSurname("smith");
		assertEquals("smith",customer.getSurname());
	}
	


}
