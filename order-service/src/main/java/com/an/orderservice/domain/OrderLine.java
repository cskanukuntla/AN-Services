package com.an.orderservice.domain;

public class OrderLine {

	private Long orderLineId;
	private Item item;

	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderLine(Long orderLineId, Item item) {
		super();
		this.orderLineId = orderLineId;
		this.item = item;
	}

	public Long getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(Long orderLineId) {
		this.orderLineId = orderLineId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
