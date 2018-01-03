package com.accolite.miniAU;

public class ParentString {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="Hello";
		String s3= new String("Hello");
		String s4 =s3.intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		System.out.println(	s1.hashCode());
		System.out.println(	s2.hashCode());
		System.out.println(	s3.hashCode());
		System.out.println(	s4.hashCode());
		
	}
	
	
}
