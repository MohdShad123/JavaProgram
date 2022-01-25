package com.infy;

public class Tester {
	public static void main(String[] args) {
		//Object Creation
		
		Customer customer1 = new Customer("Stephin Abram",7985549994L,"D089, St. Louis Street, Springfield, 62729");
		
		//Assigning Values To The Instance Variable
		/*customer1.customerId = "C101";
		customer1.customerName = "Stephen Abram";
		customer1.contactNumber = 7985549994L;
		customer1.address = "D089, St. Louis Street, Springfield, 62729"; */
		
		
		customer1.displayCustomerDetails();
		//customer1.payBill(500,10);
		System.out.println("Hi " + customer1.customerName
				+ ", your final bill amount after discount is: "
				+ customer1.payBill(500,10));
		//Customer customer2 = new Customer();
		//customer2.displayCustomerDetails();
		
	}

}
