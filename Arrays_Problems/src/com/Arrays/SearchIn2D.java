package com.Arrays;

import java.util.Arrays;

public class SearchIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{10,20,30},
				{40,50,60,70},
				{80,90,100}
		};
		int target = 60;
		int[] array = fun(arr,target);
		System.out.println(Arrays.toString(array));
		
		System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
	}
	static int[] fun(int[][] arr, int target)
	{
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				if(arr[i][j] == target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
	static int max(int[][] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int[] a : arr)
		{
			for(int i : a) {
				if(i > max)
				{
					max = i;
				}
			}
		}
		return max;
	}
}
