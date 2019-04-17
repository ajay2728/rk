package com.cg.dao;

import java.util.Map;

import com.cg.Product.Product;
import com.cg.repo.ItemRepositories;

public class ProductDaoImpl implements ProductDao {
	@Override
	public Map<Integer, Product> getItems() {
		return ItemRepositories.itemlist;	
	}

}
