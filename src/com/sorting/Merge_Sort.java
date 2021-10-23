package com.sorting;
import java.util.Scanner;
public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int  i = 0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		mergeSort(arr,0,arr.length-1);
		print(arr);

	}
	
	static void mergeSort(int[] arr, int lb, int ub)
	{
		int[] temp = new int[ub*2];
		if(lb == ub)
			return;
		int mid = lb + (ub-lb)/2;
		
		mergeSort(arr,lb,mid);
		mergeSort(arr,mid+1,ub);
		
		merging(arr,temp,lb,mid,mid+1,ub);
		copy(arr,temp,lb,ub);
	}
	
	static void merging(int[] arr, int[] temp, int low1, int up1, int low2, int up2)
	{
		int i = low1;
		int j = low2;
		int k = low1;
		
		while(i<=up1 && j<=up2)
		{
			if(arr[i] > arr[j]) {
				temp[k++] = arr[j++];
			}
			else 
				temp[k++] = arr[i++];
		}
		
		while(i<=up1)
		{
			temp[k++] = arr[i++];
		}
		while(j<=up2)
		{
			temp[k++] = arr[j++];
		}
		
	}
	
	static void copy(int[] arr, int[] temp, int low, int up) {
		for(int i = low; i<=up; i++)
		{
			arr[i] = temp[i];
		}
	}
	static void print(int[] arr)
	{
		for(int i = 0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
