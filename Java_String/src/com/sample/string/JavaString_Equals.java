package com.sample.string;

public class JavaString_Equals {

	public static void main(String[] args) 
	{
		String str1 = new String("Hi Ankit");
		String str2 = new String("Hi Ram");
		String str3 = new String("Hi Ankit");
		
		System.out.println("compare str1 and str2 : " + str1.equals(str2));

		System.out.println("compare str2 and str3 : " + str2.equals(str3));
		
		System.out.println("compare str1 and str3 : " + str1.equals(str3));
	
	
		String str4 = new String("Ankit");
		String str5 = new String("ANKIT");
		System.out.println("Case Ignore : " + str4.equalsIgnoreCase(str5));

	}

}
