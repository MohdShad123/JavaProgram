package com.infy;

public class Restaurant {
	String restaurantName;
	long restaurantNumber;
	String restaurantAddress;
	float rating;
	
	public Restaurant(String restaurantName, long restaurantNumber, String restaurantAddress, float rating){
		this.restaurantName = restaurantName;
		this.restaurantNumber = restaurantNumber;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}
	
	//public Restaurant(String name, long restaurantContact, String restaurantAddress, float rating){
		
//	}
	
	void displayRestaurantDetails() {
		System.out.println("Deatils Of Restaruant are: \n**************");
		System.out.println("Restaurant Name "+ this.restaurantName);
		System.out.println("Restaurant Rating "+ this.rating);
		System.out.println("Restaurant Number "+ this.restaurantNumber);
		System.out.println("Restuarant Address "+ this.restaurantAddress);
	}

}
