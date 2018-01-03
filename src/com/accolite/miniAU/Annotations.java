package com.accolite.miniAU;

import java.lang.reflect.Method;

public class Annotations {
	
	@MyAnno(str="Hello world", value=100)
	public static void myMeth()
	{
		Annotations anno=new Annotations();
		try {
			Class<?> c= anno.getClass();
			Method m= c.getMethod("myMeth");
			MyAnno ann=m.getAnnotation(MyAnno.class);
			System.out.println(ann.str()+" "+ann.value());
		} catch (NoSuchMethodException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		myMeth();
	}
}
