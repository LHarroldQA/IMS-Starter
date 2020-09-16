package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderItemTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order.class).verify();
	}
	
	@Test
	public void orderItemIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		Long id = 1L;
		assertEquals(id,orderItem.getId());
	}
	
	@Test
	public void orderItemOrderIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		Long id = 2L;
		assertEquals(id,orderItem.getOrderId());
	}
	
	@Test
	public void orderItemItemIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		Long id = 3L;
		assertEquals(id,orderItem.getItemId());
	}
	
	@Test
	public void orderItemQuantityTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		Long quantity = 10L;
		assertEquals(quantity,orderItem.getQuantity());
	}
	
	@Test
	public void orderItemPriceTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L,300.0);
		Double price = 300.0;
		assertEquals(price,orderItem.getOrderPrice());
	}
	
	@Test
	public void setOrderItemIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		orderItem.setId(3L);
		Long id = 3L;
		assertEquals(id,orderItem.getId());
	}
	
	@Test
	public void setOrderItemOrderIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		orderItem.setOrderId(1L);
		Long id = 1L;
		assertEquals(id,orderItem.getOrderId());
	}
	
	@Test
	public void setOrderItemItemIdTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		orderItem.setItemId(1L);
		Long id = 1L;
		assertEquals(id,orderItem.getItemId());
	}
	
	@Test
	public void setOrderItemQuantityTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L);
		orderItem.setQuantity(20L);
		Long quantity = 20L;
		assertEquals(quantity,orderItem.getQuantity());
	}
	
	@Test
	public void setOrderItemPriceTest() {
		OrderItem orderItem = new OrderItem(1L,2L,3L,10L,300.0);
		orderItem.setOrderPrice(150.0);
		Double price = 150.0;
		assertEquals(price,orderItem.getOrderPrice());
	}

}
