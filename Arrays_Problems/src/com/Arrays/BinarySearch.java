package com.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,40,60,80,90,100};
		int target = 40;
		int ans = search(array,target);
		System.out.println("Element "+array[ans] +" is found at index " + ans);
		
	}
	
	static int search(int[] array , int target)
	{
		int lb = 0;
		int ub = array.length-1;
		
		while(lb <= ub)
		{
			int mid = lb + (ub-lb)/2;
			
			if(array[mid] == target)
			{
				return mid;
			}
			else if(target < array[mid])
			{
				ub = mid-1;
			}
			else if(target > array[mid])
			{
				lb = mid+1;
			}
			/*else {
				return mid;
			}*/
		}
		return -1;
	}
	
}



