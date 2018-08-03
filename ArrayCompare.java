package com.java.intv;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {};
		int arr2[] = {};
		boolean bFlag = false;
		
		if(arr1.length==arr2.length)
		{
			for(int i = 0;i<arr1.length;i++)
			{
				
				for(int j = 0;j<arr1.length;j++)
				{
					
					if((i==j)&&(arr1[i]!=arr2[j]))
					{
						bFlag = true;
						break;
						
					}
					
					
					
					
			  }
				
				
				
				
			}
			
			if(!bFlag)
			{
			  	System.out.println("Both Arrays are equal");
			}
			else
				System.out.println("Both Arrays are not equal");
		}
			
			else 
			System.out.println("Both Arrays are not equal");
			
						
			
			
			
			
			
			
			
		}
		
		

	}


