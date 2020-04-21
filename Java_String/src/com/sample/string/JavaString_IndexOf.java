package com.sample.string;

public class JavaString_IndexOf {

	public static void main(String[] args) 
	{
		String str = "Hi Ankit";
		String str1 = "hi";
		
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i', 3));
		System.out.println(str.indexOf("kit"));
		System.out.println(str1.indexOf(str1));
		System.out.println(str1.indexOf('t',7));
	}

}
