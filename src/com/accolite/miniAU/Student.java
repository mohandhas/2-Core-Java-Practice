package com.accolite.miniAU;

public class Student {

	public String roll;
	public String name;
	
	public Student(String roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object s) {
		// TODO Auto-generated method stub
		Student student=(Student) s;
		
		if((this.name).equals(student.getName()) && (this.roll).equals(student.getRoll()))
			return true;
		return false;
	}
	
	
}
