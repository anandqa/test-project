package com.java.intv;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = ' ';
		String strWhite= "This is a          Sample Program for Removing           white spaces . *";
		System.out.println("Original: "+strWhite);
		strWhite = strWhite.replaceAll("  ", "");
		System.out.println("One Space: "+strWhite);
		strWhite = strWhite.replaceAll(" ", "");
		System.out.println("No Space: "+strWhite);
		
		String strNew = "";
		
		String str2 = "He is a                  good person";
		
		for(int i = 0;i<str2.length();i++)
			
		{
			if(Character.isWhitespace(str2.charAt(i)))
			 strNew = strNew+"";
			else
			  strNew = strNew+Character.toString(str2.charAt(i));	
						
		}
		
		
		System.out.println(strNew);
			
		}
		
		
		

	}


