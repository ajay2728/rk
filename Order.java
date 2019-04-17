package com.cg.Product;

import com.cg.repo.ItemRepositories;

public class Order {
	private int orderId;
	private String mobile;
	private int itemId;
	private int quantity;
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
	@Override
	public String toString() {
		return "\norderId\t:\t" + orderId + "\nmobile\t:\t" + mobile + "\nitemId\t:\t" + itemId + "\nquantity\t:\t"
				+ quantity ;
	}

	public Order(int orderId, String mobile, int itemId, int quantity) {
		super();
		this.orderId = orderId;
		this.mobile = mobile;
		this.itemId = itemId;
		this.quantity = quantity;
	}

}
