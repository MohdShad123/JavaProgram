package com.sorting;
import java.util.*;
public class Radix_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		radixSort(arr);
		print(arr);
	}
	
	static void radixSort(int[] arr) {
		
		int max = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int exp = 1; max/exp>0; exp*=10) {
			countSort(arr,exp);
		}
	}
	
	static void countSort(int[] arr,int exp) {
		
		int[] freq = new int[10];
		
		for(int i = 0; i<arr.length; i++)
		{
			//int index = (arr[i] / exp) % 10;
			freq[(arr[i] / exp) % 10]++;
		}
		
		for(int i= 1; i<freq.length; i++) {
			freq[i] = freq[i] + freq[i-1];
		}
		
		int[] ans = new int[arr.length];
		
		for(int i = arr.length-1; i>=0 ;i--) {
			//int value = arr[i] / exp % 10;
			//int index = freq[value];
			int pos =	freq[(arr[i] / exp) % 10] - 1;
			ans[pos] = arr[i];
			freq[arr[i] / exp % 10]--;
			
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = ans[i];
		}
	}
	
	static void print(int[] arr) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
