package com.accolite.miniAU;

import java.util.HashMap;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<String, String> hm=new HashMap<>();
//		hm.put("roll 1", "sathya");
//		hm.put("roll 2", "tarun");
//		hm.put("roll 3", "piyuish");
//		
		Student s1= new Student("1", "sathya");
		Student s2=new Student("1","sathya");
		Student s3= new Student("2", "tarun");

		//System.out.println(hm.toString());
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}

}
