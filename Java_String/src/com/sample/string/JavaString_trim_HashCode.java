package com.sample.string;

public class JavaString_trim_HashCode {

	public static void main(String[] args)
	{
		String str = new String("   How are You ");
		
		System.out.println("Before trim : " + str);
		System.out.println("After trim : " + str.trim());

		String str1 = new String("Hi");
		
		System.out.println(str1.hashCode());
	}

}
