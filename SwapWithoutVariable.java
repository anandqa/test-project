package com.java.intv;

public class SwapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = 200;
		
		System.out.println("before swapping a = "+a+ " before swapping b="+b);
		/*swapping without 3rd variable*/
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("after swapping a = "+a+ " after swapping b="+b);
		
	}

}
