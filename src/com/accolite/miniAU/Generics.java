package com.accolite.miniAU;

public class Generics<T> {
	
	T[] numbs;

	public Generics(T[] o) {
		super();
		this.numbs = o;
	}	
	
	double average()
	{
		double sum=0.0;
		for(int i=0;i<numbs.length;i++)
		{
			sum+= ((double) numbs[i]);
		}
		return sum/numbs.length;
	}

}
