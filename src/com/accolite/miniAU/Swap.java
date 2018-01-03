package com.accolite.miniAU;

public class Swap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapper s=new Swapper();
		int a =2, b=3;
		s.swap(a, b);
		System.out.println("A: "+a+" B: "+b);
		s.swap(22, 76);
		System.out.println("A: "+a+" B: "+b);
	}
}
