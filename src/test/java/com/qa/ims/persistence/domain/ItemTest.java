package com.qa.ims.persistence.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

import static org.junit.Assert.assertEquals;


public class ItemTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Item.class).verify();
	}
	
	@Test
	public void itemNameTest() {
		Item item = new Item("book",10.99,"autobiography");
		assertEquals("book",item.getProductName());
	}
	
	@Test
	public void itemPriceTest() {
		Item item = new Item("book",10.99,"autobiography");
		Double price = 10.99;
		assertEquals(price,item.getPrice());
	}
	
	@Test
	public void itemDescTest() {
		Item item = new Item("book",10.99,"autobiography");
		assertEquals("autobiography",item.getDescription());
	}
	
	@Test
	public void itemSetNameTest() {
		Item item = new Item("book",10.99,"autobiography");
		item.setProductName("magazine");
		assertEquals("magazine",item.getProductName());
	}
	
	@Test
	public void itemSetPriceTest() {
		Item item = new Item("book",10.99,"autobiography");
		item.setPrice(14.99);
		Double price = 14.99;
		assertEquals(price,item.getPrice());
	}
	
	@Test
	public void itemSetDescTest() {
		Item item = new Item("book",10.99,"autobiography");
		item.setDescription("novel");
		assertEquals("novel",item.getDescription());
	}


}
