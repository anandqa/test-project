package com.java.intv;

import java.util.Scanner;

import javax.swing.text.Utilities;

public class NLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrNum[] = {11,55,58,79,45,0,5,47,458,5,3,2,0,1,-1};
		
		for(int i= 0;i<arrNum.length;i++)
		{
		   for(int j = 0;j<arrNum.length;j++)
			   
		   {
			   int temp=0;
			    
			   if(arrNum[i]>arrNum[j])
			   {
				  temp = arrNum[i];
				  
				  arrNum[i] =arrNum[j];
				  arrNum[j] = temp;
				   
			   }
			   
			   
		   }
			
}		
		for(int k: arrNum){
			System.out.println(k);
		}
		
		System.out.println("Enter the nth largest from array");
		
		//Scanner n = new Scanner(System.in);
		//int input = n.nextInt();
		//arrNum.length-n;
		System.out.println(arrNum[Integer.parseInt(args[0])-1]);
		
		
		
		
		

	}

}
