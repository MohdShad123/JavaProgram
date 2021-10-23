package com.sorting;
import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		print(arr);
	}
	
	  static void quickSort(int[] arr,int low, int up)
	{
		int pivot;
		
		if(low >= up)
			return;
		pivot = partition(arr,low,up);
		
		quickSort(arr,low,pivot-1);
		quickSort(arr,pivot+1,up);
	}
	  
	  static int partition(int[] arr, int low, int up)
	  {
		  int temp,i,j,pivot;
		  
		  pivot = arr[low];
		  i = low+1;
		  j = up;
		  
		  while(i <= j)
		  {
			  while(pivot > arr[i] && i<up)
				  i++;
			  while(pivot < arr[j])
				  j--;
		  
			  if(i<j)
			  	{
				  temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
				  i++;
				  j--;
			  	}
			  else
			  break;
		  }
		  arr[low] = arr[j];
		  arr[j] = pivot;
		  return j;
	  }
	  static void print(int[] arr)
	  {
		  for(int i = 0; i<arr.length; i++)
		  {
			  System.out.print(arr[i] + " ");
		  }
	  }
}
