package com.sorting;

import java.util.Arrays;

public class Bubbble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Sorting using single loop
		
		int[] arr = {4,2,5,1,3};
		System.out.println("Before sorting array value are :");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		for(int i = 0 ; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				 i = -1;
			}
		}
		System.out.println("After sorting array value are: ");
		System.out.println(Arrays.toString(arr));
	}

}
