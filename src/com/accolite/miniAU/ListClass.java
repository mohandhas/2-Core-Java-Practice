package com.accolite.miniAU;

import java.util.LinkedList;
import java.util.List;

public class ListClass {
	
	static List<String> ll=new LinkedList<String>();
	
	static void insert(String value)
	{
		ll.add(value);
		System.out.println("added");
	}
	
	static void size()
	{
		System.out.println(ll.size());
	}
	
	static void delete(String value)
	{
		ll.remove(value);
	}
	
	static void display()
	{
		System.out.println(ll.toString());
	}
	
	public static void main(String[] args)
	{
		insert("sathya");
		insert("tarun");
		insert("piyuish");
		display();
		size();
		delete("tarun");
		display();
	}
}
