package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.Product.Order;
import com.cg.Product.Product;


public interface CustomerServiceOrder {
	List<Order> orderList = new ArrayList<Order>();
	boolean addToCart(Order item);
	List<Order> printOrderedItems();
	public List<Product> getItems();
	

}
