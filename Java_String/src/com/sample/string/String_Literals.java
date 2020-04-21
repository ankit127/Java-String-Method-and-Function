package com.sample.string;

public class String_Literals {

	public static void main(String[] args) 
	{
		
		//String is Immutable object. it is constant once it's declared we can't change
	    String str = "Welcome to";
	    
	    char str1[] = {'s','t','r','i','n','g'};
	    //char chabge to string
	    String str2 = new String(str1);
	    
        String str3 = new String("World");
        
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
	}

}
