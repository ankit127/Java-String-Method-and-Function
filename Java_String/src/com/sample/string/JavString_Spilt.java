package com.sample.string;

public class JavString_Spilt {

	public static void main(String[] args) 
	{
		String str =new String("28/12/2020");
		
		String Arr[] = str.split("/");
		for(String temp : Arr)
		{
			System.out.println(temp);
		}
		System.out.println("****************");
		
		String str1 = new String("bbccaa");
		String Arr1[] =str1.split("c", -1);
		for(String temp : Arr1)
		{
			System.out.println(temp);
		}
		
		System.out.println("****************");
		
		String str2 = new String("ankit@Wani");
		String Arr2[] = str2.split("@");
		for(String temp :Arr2)
		{
			System.out.println(temp);
		}

	}

}
