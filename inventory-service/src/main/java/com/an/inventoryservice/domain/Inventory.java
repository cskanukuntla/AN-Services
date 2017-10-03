package com.an.inventoryservice.domain;

public class Inventory {

	private Long itemId;
	private String itemDesc;
	private Integer quantity;

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(Long itemId, String itemDesc, Integer quantity) {
		super();
		this.itemId = itemId;
		this.itemDesc = itemDesc;
		this.quantity = quantity;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
