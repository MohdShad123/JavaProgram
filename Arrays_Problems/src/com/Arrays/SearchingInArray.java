package com.Arrays;  //LinearSearch

public class SearchingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,30,40,50};
		
		int target = 40;
		
		//int ans = 
		linearsearch(array, target);
		//System.out.println(ans);
		

	}
	static void linearsearch(int arr[], int target)
	{
		if(arr.length == 0) {
			System.out.println("Array does not exist:");
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			int element = arr[i];
			if( element == target)
			{
				System.out.println("Element " + element +" is found at index " + i);;
			}
		}
		
		//return -1;
	}

}
