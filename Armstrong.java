package com.java.intv;

public class Armstrong {

	public static void main(String[] args) {
		

		int num = 153;
		
		
		isArm(num);
		
		

	}
	
	public static void isArm(int n)
	{
	
		int  sum = 0;
	   int rem = 0;
	   int temp = n;
	   	   
	   if(n>0)
	   {
		 while (n>0)
		 {
		   rem = n%10;	 
		   sum = sum+(rem*rem*rem);
		   n = n/10;
		   
		   		 
		 }  
		   
	   }  
	   if(sum==temp)
			
			System.out.println("Armstrong Number");
		   else
			System.out.println("Not Armstrong number");
   
	}
	

}
