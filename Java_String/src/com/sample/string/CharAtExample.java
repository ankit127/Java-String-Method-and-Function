package com.sample.string;

public class CharAtExample {

	public static void main(String[] args)
	{
		String str = "Welcome to Diseney World";
		
		char ch1 = str.charAt(1);
		
		System.out.println(ch1);
		
		char ch2 = str.charAt(11);
		
		System.out.println(ch2);
		/*
		char ch3 = str.charAt(-1);
		
		System.out.println(ch3);
		*/
		System.out.println("======================");
		//TO Print all char of string
		
		String str1 = "To Print all Chacter";
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) 
		{
			System.out.println(str1.charAt(i));
			if(str1.charAt(i) == 'a')
			{
				counter++;
			}	
		}
		System.out.println("Charcter at : "+counter+" times");
	}
	

}
