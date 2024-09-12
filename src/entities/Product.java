package entities;

public class Product {
	private String title;
	private double price;
	private int amount;
	
	public Product(String title,double price,int amount) {
		this.title = title;
		this.price = price;
		this.amount = amount;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void addQuantities(int value) {
		this.amount += value;
	}
	
	public void removeQuantities(int value) {
		this.amount -= value;
	}
	
	public String productInfo() {
		return "O preço do produto " + this.title + " é " + String.format("%.2f", this.price);
	}
	
	public String quantityInfo() {
		return "A quantidade atual é: " + this.amount;
	}
}
