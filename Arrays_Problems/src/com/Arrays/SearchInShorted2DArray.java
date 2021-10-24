package com.Arrays;  //Question-->Search in a Sorted Matrix
import java.util.Arrays;
public class SearchInShorted2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int target = 7;
		System.out.println(Arrays.toString(search(arr,target)));
	}
	
	// search in the row provided between the cols provided
	public static int[] binarySearch(int[][] arr,int row,int cStart, int cEnd, int target) {
	
		while(cStart <= cEnd)
		{
			int mid = cStart + (cEnd-cStart)/2;
			
			if(arr[row][mid] == target)
			{
				return new int[]{row,mid};
			}
			
			else if(target > arr[row][mid])
			{
				cStart = mid+1;
			}
			else {
				cEnd = mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	
	
	public static int[] search(int[][] arr, int target)	{
		int rows = arr.length;
		int cols = arr[0].length; // be cautious Matrix May be empty
		
		if(cols == 0)
		{
			return new int[]{-1,-1};
		}
		
		if(rows == 1)
		{
			binarySearch(arr, 0, 0, cols-1,target);
		}
		
		int rStart = 0;
		int rEnd = rows-1;
		int cMid = cols/2;
		
		// run the loop till 2 rows are remaining
	
		while(rStart < (rEnd-1))  // while this is true it will have more than 2 rows
		{
			
			int mid = rStart + (rEnd - rStart)/2;
			
			if(arr[mid][cMid] == target)
			{
				return new int[]{mid,cMid};
			}
			else if(target > arr[mid][cMid])
			{
				rStart = mid;  //ignoring all the above elements
			}
			else {
				rEnd = mid;  // ignoring all the below elements
			}
		}
		
		// now we have two rows
        // check whether the target is in the col of 2 rows
		
		if(arr[rStart][cMid] == target)
		{
			return new int[] {rStart,cMid};
		}
		
		if(arr[rStart+1][cMid] == target)
		{
			return new int[] {rStart+1,cMid};
		}
		
		//Searching in First Half
		if(target <= arr[rStart][cMid-1])
		{
			return binarySearch(arr,rStart,0,cMid-1,target);
		}
		//Searching in Second half
		if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols - 1])
		{ 
			return binarySearch(arr, rStart, cMid+1, cols-1,target);
		}
		//Searching in third half
		if(target <= arr[rStart+1][cMid-1])
		{
			return binarySearch(arr,rStart+1,0,cMid-1,target);
		}
		else {
			return binarySearch(arr,rStart+1,cMid+1,cols,target);
		}
		
		
	}
}
