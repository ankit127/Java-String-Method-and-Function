package com.sample.string;

public class JavaString_Contains {

	public static void main(String[] args) 
	{
	
		String str = "Do you like to save money for marraige";

		System.out.println(str.contains("like"));
		System.out.println(str.contains("save"));
		System.out.println(str.contains("MARRAIGE"));
		
		String str1 = "Do You like ankit";
		String str2 = "ANKIT";
		
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
	}

}
