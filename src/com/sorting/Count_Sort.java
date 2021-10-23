package com.sorting;
import java.util.*;
public class Count_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = scn.nextInt();
			//max = Math.max(max, arr[i]);
			//min = Math.min(min, arr[i]);
		}
		
		countSort(arr);
		print(arr);
		
	}
	
	static void countSort(int[] arr)
	{
		//int range = max-min+1;
		int[] freq = new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			int indx = arr[i];
			freq[indx]++;
		}
		
		for(int i = 1; i<10; i++)
		{
			freq[i] = freq[i] + freq[i-1];
		}
		
		int[] ans = new int[arr.length];
		
		for(int i = arr.length-1; i>=0 ;i--)
		{
			int val = arr[i];
			int pos = freq[val];
			int idex = pos-1;
			ans[idex] = val;
			freq[val]--;
			
		}
		for(int i = 0; i< arr.length ; i++)
		{
			arr[i] = ans[i];
		}
	}
	
	public static void print(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
