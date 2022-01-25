package com.infy;

public class Food{
	
	private String foodName;
	private String cuisine;
	private int quantityAvailable;
	private double price;
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public void display() {
		System.out.println("Food Name = " + foodName);
		System.out.println("Cuisines = " + cuisine);
		System.out.println("QuantityAvailable = " + quantityAvailable);
		System.out.println("Price =" + price);
	}
	
}


  class test {
	  public static void main(String[] args) {
			 Food food1 = new Food();
			 
			 food1.setFoodName("pasta");
			 System.out.println("Food Name " + food1.getFoodName());
			 
			 food1.display();
		}
}
