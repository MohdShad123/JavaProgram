package com.infy;


public class Order {
	int orderId;
	String orderFoods;
	long totalPrice;
	String status;
	
	public Order(int orderId, String orderFoods, String status) {
		this.orderId = orderId;
		this.orderFoods = orderFoods;
		this.status = status;	
	}
	
	public Order() {
		this.status = "ordered";
	}
	public Order(int orderId, String orderFoods) {
		this.orderId = orderId;
		this.orderFoods = orderFoods;
	}

	public double calculateTotalPrice(int unitPrice) {
		totalPrice = unitPrice*5/100;
		return totalPrice; 
	}
	
	public void display() {
		System.out.println("Order Details :");
		System.out.println("Order Id: " + orderId);
		System.out.println("OrderFoods: " + orderFoods);
		System.out.println("Status: " + status);
		System.out.println("Total Price: " + this.calculateTotalPrice(700));
	}
}
