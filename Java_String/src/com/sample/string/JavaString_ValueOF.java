package com.sample.string;

public class JavaString_ValueOF {

	
	public static void main(String[] args) 
	{
//public static String valueOf(boolean b): Used for converting boolean value to a String	
       
		//int to string
		System.out.println("int to string");
		int number = 23;
		String str = String.valueOf(number);
		System.out.println(str);
		
		//char to string
		System.out.println("char to string");
		char str1[] = {'a','n','k'};
		String str2 = String.valueOf(str1);
		System.out.println(str2);
		
		
	}

}
