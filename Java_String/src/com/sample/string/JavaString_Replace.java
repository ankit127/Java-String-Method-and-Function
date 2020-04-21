package com.sample.string;

public class JavaString_Replace {

	public static void main(String[] args) 
	{
		String  str = "Hi Raman welcome to Mumbai Fan club";
		
		String str1 = str.replace('R', 'k');
		System.out.println(str1);

		System.out.println(str1.replaceFirst("Hi", "Hello"));
		
		String str2 = str.replaceAll(str, "kay bhau");
		System.out.println(str2);
		
	}

}
