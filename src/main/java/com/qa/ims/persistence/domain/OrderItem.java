package com.qa.ims.persistence.domain;

public class OrderItem {
	
	private Long id;
	private Long orderId;
	private Long itemId;
	private String itemName;
	private Long quantity;
	private Double orderPrice;
	
	public OrderItem(Long id, Long orderId, Long itemId, String itemName,Long quantity,Double orderPrice) {
		super();
		this.setId(id);
		this.setOrderId(orderId);
		this.setItemId(itemId);
		this.setItemName(itemName);
		this.setQuantity(quantity);
		this.setOrderPrice(orderPrice);
	}
	
	public OrderItem(Long id, Long orderId, Long itemId, Long quantity) {
		super();
		this.setId(id);
		this.setOrderId(orderId);
		this.setItemId(itemId);
		this.setQuantity(quantity);
	}
	
	public OrderItem(Long orderId, Long itemId, Long quantity) {
		super();
		this.setOrderId(orderId);
		this.setItemId(itemId);
		this.setQuantity(quantity);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "OrderItem Id:" + id + "  OrderId:" + orderId + "  ItemId:" + itemId + "  ItemName:" + itemName
				+ "  Quantity:" + quantity + "  OrderPrice:" + orderPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderPrice == null) ? 0 : orderPrice.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderPrice == null) {
			if (other.orderPrice != null)
				return false;
		} else if (!orderPrice.equals(other.orderPrice))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
}
