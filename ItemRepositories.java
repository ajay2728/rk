package com.cg.repo;

import java.util.HashMap;
import java.util.Map;

import com.cg.Product.Product;

public class ItemRepositories {
	
	public static Map<Integer , Product> itemlist = new HashMap<>();
	
	static {
	itemlist.put(10 , new Product("Laptop" , 10 , 60000));
	itemlist.put(11 , new Product("Car" , 11 , 6000000));
	itemlist.put(12 , new Product("phone" , 12 , 60000));
	itemlist.put(13 , new Product("Harley Davidson" , 13 , 500000));
	itemlist.put(14 , new Product("Ship" , 14 , 600));
	
	}
	
	

}
