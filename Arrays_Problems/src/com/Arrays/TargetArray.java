package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4};
		int[] b = {0,1,2,2,1};
		//int[] c = createTargetArray(a,b);
		ArrayList<Integer> l1 = new ArrayList<>();
		for(int i =0;i<a.length; i++)
		{
			l1.add(b[i],a[i]); //here array a[i] has elements and b[i] has index
		}
		
		System.out.println(l1);
		
	/*	int[] ans = new int[a.length];
		for(int i = 0; i<a.length; i++)
        {
            ans[i] = l1.get(i);
        }
		
		System.out.println(l1); */
		
	}

	
	   /* public static int[] createTargetArray(int[] nums, int[] index) {
	        ArrayList<Integer> a = new ArrayList<>();
	        for(int i = 0 ; i< nums.length; i++)
	        {
	            a.add(index[i],nums[i]);
	        }
	        System.out.println(a);
	        int[] ans = new int[nums.length];
	        for(int i = 0; i<nums.length; i++)
	        {
	            ans[i] = a.get(i);
	        }
	        return ans;
	    }*/
	

}
