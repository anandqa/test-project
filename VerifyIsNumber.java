package com.java.intv;

import java.util.Scanner;

public class VerifyIsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		*/
		System.out.println("Please enter your input");
		
        char ch = '5';
        
        System.out.println(Character.isDigit(ch));
        
        
        
        String isNum = "110";
        
        System.out.println(isNumber(isNum));
        
        
        
        
        
		
		
	}
	
	public static boolean isNumber(String str)
	{
	
		
		
		try
		{
			Double num = Double.parseDouble(str);	
			
			
		}catch(NumberFormatException nfe)
		{
			
			return false;
		}
		
		return true;
		
	}

}
