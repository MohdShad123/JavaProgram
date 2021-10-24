package com.Arrays;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Computer Science";
		int n = s.length();
		StringBuffer s1 = new StringBuffer(s);
		
		String res = "";
		for(int i = 0; i<n; i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.charAt(ch)>='a' && s1.charAt(ch)<='z'){
				res  += Character.toUpperCase(s.charAt(ch));
			}
			if(s1.charAt(ch)>='A' && s1.charAt(ch)<='Z'){
				res += Character.toLowerCase(s.charAt(ch));
			}
		}
		System.out.println(res);

	}

}
