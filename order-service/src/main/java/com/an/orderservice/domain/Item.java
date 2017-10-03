package com.an.orderservice.domain;

import java.math.BigDecimal;

public class Item {

	private Long itemId;
	private String itemDesc;
	private BigDecimal price;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String itemDesc, BigDecimal price) {
		super();
		this.itemId = itemId;
		this.itemDesc = itemDesc;
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
