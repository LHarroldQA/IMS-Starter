package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order.class).verify();
	}
	
//	@Test
//	public void orderCustomerIdTest() {
//		Order order = new Order(1L,2L,4);
//		Long customerId = 1L;
//		assertEquals(customerId,order.getCustomerId());
//	}
//	
//	@Test
//	public void orderItemIdTest() {
//		Order order = new Order(1L,2L,4);
//		Long itemId = 2L;
//		assertEquals(itemId,order.getItemId());
//	}
//	
//	@Test
//	public void orderQuantityTest() {
//		Order order = new Order(1L,2L,4);
//		Integer quantity = 4;
//		assertEquals(quantity,order.getQuantity());
//	}
//	
//	@Test
//	public void orderSetCustomerIdTest() {
//		Order order = new Order(1L,2L,4);
//		order.setCustomerId(4L);
//		Long customerId = 4L;
//		assertEquals(customerId,order.getCustomerId());
//	}
//	
//	@Test
//	public void orderSetItemIdTest() {
//		Order order = new Order(1L,2L,4);
//		order.setItemId(3L);
//		Long itemId = 3L;
//		assertEquals(itemId,order.getItemId());
//	}
//	
//	@Test
//	public void orderSetQuantityTest() {
//		Order order = new Order(1L,2L,4);
//		order.setQuantity(15);
//		Integer quantity = 15;
//		assertEquals(quantity,order.getQuantity());
//	}
//	
//	@Test
//	public void orderPriceTest() {
//		Order order = new Order(1L,1L,2L,4,350.0);
//		Double price = 350.0;
//		assertEquals(price,order.getOrderPrice());
//	}
//	
//	@Test
//	public void orderSetPriceTest() {
//		Order order = new Order(1L,1L,2L,4,350.0);
//		order.setOrderPrice(400.0);
//		Double price = 400.0;
//		assertEquals(price,order.getOrderPrice());
//	}
}
