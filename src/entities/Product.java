package entities;

import java.util.Objects;

public class Product {
	
	private String name;
	private Double price;
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticProductUpdate(Product p) { //Static methods require own object argument to work with
		 p.setPrice(p.getPrice()*1.10);
	}
	
	public boolean nonStaticProductUpdate() {// non static methods work wit the same object in which it's defined, therefore we don't pass a Product as argument 
		return this.getPrice()>=100.00;
	}
	
	@Override
	public String toString() {
		return this.name + " " + String.format("%.2f",this.price);
	}

	
}
