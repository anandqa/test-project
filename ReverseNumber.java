package com.java.intv;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123456789;
		int sum = 0;
		int remainder = 0;
		
		do 	
		{
		 remainder = num%10; 	
			
		 sum = sum*10+remainder;
		 
		 num = num/10;
			
			
		}while(num>0);
		
		
		System.out.println(sum);

	}

}
