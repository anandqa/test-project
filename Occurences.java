package com.java.intv;

import java.util.HashMap;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class Occurences {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		String str = "Hello Java world is a program";
		String s1=str.replace(" ", "");
		String str1 = new String(s1);
		String result = "";
		
		for (int i = 0;i <s1.length();i++)
			
		{  
			int count = 0;
			for (int j = 0;j<str1.length();j++)
			{
			 
			    if(Character.toString(s1.charAt(i)).equals(Character.toString(str1.charAt(j))))
			     count++;
			}
			
			if(count>1){
				result= s1.charAt(i)+" is repeated "+count+" times";
				System.out.println(result);
				str1 = str1.replaceAll(Character.toString(s1.charAt(i)), "");
			}
	}
		System.out.println("Map Example: "+OccurencesHashManp(str.replace(" ", "")));
	}
	
	public static HashMap<Character, Integer>OccurencesHashManp(String s){
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		Integer count = 0;
		for (Character c: s.toCharArray()){
			Integer i = hashMap.get(c);
			count = hashMap.get(c)==null?1:i+1;
				hashMap.put(c,count);
		}
		
		return hashMap;
	}
	
}
