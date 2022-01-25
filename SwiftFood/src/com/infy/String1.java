package com.infy;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello :" + args[0]);
		String s = "Mohd";
		System.out.println(s);
		s = "Hello";
		System.out.println(s);
		s.concat("How are You");
		System.out.println(s);
		
		int[] a = new int[] {1,2,3,4};
		for(int num : a)
		{
			System.out.print(num + " ");
		}
	}

}
