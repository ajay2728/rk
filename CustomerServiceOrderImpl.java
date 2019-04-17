package com.cg.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.cg.Product.Order;
import com.cg.Product.Product;
import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.repo.ItemRepositories;

public class CustomerServiceOrderImpl implements CustomerServiceOrder {
	ProductDao dao = new ProductDaoImpl();

	@Override
	public boolean addToCart(Order item) {
		orderList.add(item);
		return true;
	}

	@Override
	public List<Order> printOrderedItems() {

		return orderList;
	}

	@Override
	public List<Product> getItems() {
		Collection collect = dao.getItems().values();
		List<Product> arrlist = new ArrayList<Product>();
		arrlist.addAll(collect);
		return arrlist;
	}

}
