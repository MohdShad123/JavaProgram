package com.infy;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	public Customer(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		
	}
	void displayCustomerDetails() {
		System.out.println("Dispalying Customer Details \n**************");
		System.out.println("Customer Id = "+ customerId);
		System.out.println("Customer Name = " + customerName);
		System.out.println("Contact Number = " + contactNumber);
		System.out.println("Coustomer addres = " + address);
		
	}
	
	/*public void payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid......");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		System.out.println("Hi " + customerName
				+ ", your final bill amount after discount is: "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	*/

	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}


	

}
