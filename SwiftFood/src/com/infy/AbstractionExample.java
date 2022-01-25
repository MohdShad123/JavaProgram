package com.infy;

public class AbstractionExample {
	String customername;
	
	public void payBill(double totalPrice, double discount) {
		System.out.println("Calculating Final Amount to be paid: ");
		double priceAfterdiscount = totalPrice * (1 - (discount/100));
		System.out.println("Hi " + customername + ", Your final Bill amount after discount is: " + (int)(priceAfterdiscount * 100) / 100.0);
	}

}
