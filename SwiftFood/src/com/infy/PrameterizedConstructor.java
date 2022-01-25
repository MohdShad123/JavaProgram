package com.infy;

public class PrameterizedConstructor {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	public PrameterizedConstructor(String id, String name, long number, String add) {
		customerId = id;
		customerName = name;
		contactNumber = number;
		address = add;
	}

}
 class Demo1{
	public static void main(String[] args) {
		PrameterizedConstructor customer1 = new PrameterizedConstructor("C103", "Jacob", 5648394590L,"13th Street, New York");
		System.out.println(customer1.customerId);
		System.out.println(customer1.customerName);
		System.out.println(customer1.contactNumber);
		System.out.println(customer1.address);
	}
}
