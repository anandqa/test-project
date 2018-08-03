package com.java.intv;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi this is Java World!";
		
		String newStr = "";
		
		for(int i = str.length()-1;i>=0;i--)
			
		{
		  newStr = newStr+str.charAt(i);	
			
			
		}
		
		System.out.println(newStr);
		
		
		
		
		
		
		
	}

}
