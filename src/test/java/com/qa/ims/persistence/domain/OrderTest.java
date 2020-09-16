package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order.class).verify();
	}
	
	@Test
	public void orderIdTest() {
		Order order = new Order(1L,2L,"Essex");
		Long id = 1L;
		assertEquals(id,order.getId());
	}
	
	@Test
	public void orderCustomerIdTest() {
		Order order = new Order(1L,2L,"Essex");
		Long customerId = 2L;
		assertEquals(customerId,order.getCustomerId());
	}
	
	@Test
	public void orderAddressTest() {
		Order order = new Order(1L,2L,"Essex");
		assertEquals("Essex",order.getAddress());
	}
	
	@Test
	public void orderIdSetTest() {
		Order order = new Order(1L,2L,"Essex");
		order.setId(4L);
		Long id = 4L;
		assertEquals(id,order.getId());
	}
	
	@Test
	public void orderCustomerIdSetTest() {
		Order order = new Order(1L,2L,"Essex");
		order.setCustomerId(4L);
		Long customerId = 4L;
		assertEquals(customerId,order.getCustomerId());
	}
	
	@Test
	public void orderSetAddressTest() {
		Order order = new Order(1L,2L,"Essex");
		order.setAddress("London");
		assertEquals("London",order.getAddress());
	}
}
