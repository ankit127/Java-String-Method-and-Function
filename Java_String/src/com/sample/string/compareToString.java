package com.sample.string;

public class compareToString {

	public static void main(String[] args) 
	{
		
		String str1 = "hi amk";
		String str2 = "Hi";
		String str3 = "hi ankit";
		
		int var1 = str1.compareTo(str2);
		
		System.out.println("comparison of str1 and str2 : " +var1);

       int var2 = str2.compareTo(str3);
		
		System.out.println("comparison of str2 and str3 : " +var2);

	
       int var3 = str1.compareTo(str3);
		
		System.out.println("comparison of str1 and str3 : " +var3);

		
		//comapareToIgnore Case
		
		String str4 = "HELLO";
		String str5 = "hello";
		
		int var4 = str4.compareToIgnoreCase(str5);
		
		System.out.println("comparison of str4 and str5 : " +var4);
		
	}

}
