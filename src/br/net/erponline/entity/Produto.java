package br.net.erponline.entity;

public class Produto {
	private String name;
	private double price;
	private int quantity;
	
	public Produto() {
		super();
	}
	
	public Produto(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Produto " + this.name + 
				", $ " + String.format("%.2f", this.price) + ", " + 
				this.quantity + " units, " + 
				"Total " + String.format("%.2f", this.totalValueInStock());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}