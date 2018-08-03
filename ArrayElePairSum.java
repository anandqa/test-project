package com.java.intv;

import java.util.Scanner;

public class ArrayElePairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {4, 5, 7, 11, 9, 13, 8, 12};
		
		System.out.println("Please enter your choice of number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int iNum = sc.nextInt();
		
		for(int i = 0;i<num.length;i++)
			
		{
			
			for(int j = 0;j<num.length;j++)
				
			{
				if((num[i]+num[j])==iNum)
				{
				   System.out.println("("+num[i]+", "+num[j]+")");	
				}
				
				
				
			}
			
			
		}
		
		
		

	}

}
