package com.cg.Product;

public class Product {
    private String name;
    private int id ;
    private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nname=" + name + ", id=" + id + ", price=" + price ;
	}
	
	
    
     

}
