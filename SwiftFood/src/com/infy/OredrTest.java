package com.infy;

public class OredrTest {
	public static void main(String[] args) {
		Order obj = new Order(101,"Spanich Alfrido pasta","Order");
		obj.display();
		
		Order obj1 = new Order();
		System.out.println("Status of Order1: "+obj1.status);
		Order obj2 = new Order(1001,"Garlic syrup");
		System.out.println("Status of Order2: " +obj1.status);
		System.out.println("Id of Order2: " +obj2.orderId);
		System.out.println("Items Order in Oredr2: "+obj2.orderFoods);
		
		
	}

}
