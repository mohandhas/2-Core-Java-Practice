package com.accolite.miniAU;

class Parent{
	
	public Integer add(Integer n1, Integer n2)
	{
		return n1+n2;
	}
	
//	public void add(int n1, int n2, int n3)
//	{
//		sum=(n1+n2+n3);
//	}
//	
//	public void add(double n1, double n2)
//	{
//		double sum=(n1+n2);
//	}
//	
//	public void display()
//	{
//		System.out.println(sum);
//	}	
}

public class classExample {

	public static void main(String[] args)
	{
		Parent parent=new Parent();
		
		System.out.println(parent.add(new Integer(3), new Integer(4)));
//		parent.display();
//		parent.add(3.3, 5.3);
//		parent.display();
//		parent.add(2, 3, 4);
//		parent.display();
		
	}
	
}
