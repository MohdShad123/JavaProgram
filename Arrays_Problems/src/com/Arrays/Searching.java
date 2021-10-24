package com.Arrays;
import java.util.Scanner;
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the Element to be Searched in Array: ");
		int target = in.nextInt();
		
		/*int ans =*/ // linearSearching(arr,target);
		//System.out.println("The Element "+arr[ans]+"vis found at index Number: " + ans);
		
		int sol = binarySearch(arr,target);
		System.out.println("The element is found at index " + sol);

	}
	/*public static int linearSearching(int[] arr,int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	} */
	
	public static void linearSearching(int[] arr,int target)
	{
		int i;
		if(arr.length == 0)
		{
			System.out.println("Array does not Exixt: ");
		}
		for( i = 0; i<arr.length; i++)
		{
			if(arr[i] == target)
			{
				System.out.println("Element "+arr[i]+" is found at index " + i);
				break;
			}
		}
		if(i == arr.length)
		{
			System.out.println("element is not found ");
		}
	}
	
	public static int binarySearch(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
		}
		return -1;
	}
}
