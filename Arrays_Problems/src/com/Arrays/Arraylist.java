package com.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 System.out.println(list);
		 System.out.println(list.get(0));
		 System.out.println(list.size());

		 ArrayList<Integer> list1 = new ArrayList<>();
		 //we can also take user input in ArrayList
		for(int i = 0; i<6; i++)
		{
			list1.add(input.nextInt());
		}
		for(int i = 0; i<6; i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1);
		int a = list1.get(0)+1;
		System.out.println(a);
		list1.add(a, null);
		int b = list1.get(0);
	}

	
}
