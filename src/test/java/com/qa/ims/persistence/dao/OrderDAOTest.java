package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {
	
	private final OrderDAO DAO = new OrderDAO();
	
	@Before
	public void setup() {
		DBUtils.connect("src/test/resources/db.properties");
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testCreate() {
		final Order created = new Order(2L,1L,"Essex");
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Order> expected = new ArrayList<>();
		expected.add(new Order(1L,1L,"Essex"));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test
	public void testReadLatest() {
		assertEquals(new Order(1L,1L,"Essex"), DAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final Long ID = 1L;
		assertEquals(new Order(ID,1L,"Essex"), DAO.readOrder(ID));
	}
	
	@Test
	public void testUpdate() {
		final Order updated = new Order(1L,1L,"London");
		assertEquals(updated, DAO.update(updated));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}
