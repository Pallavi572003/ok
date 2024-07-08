package com.Static;

public class Classroom {
	private static int section;
	private static int srNo;

	static {
		System.out.println("In static block");
	}
	public Classroom() {
		System.out.println("Inside the constructor");
		section++;
		srNo++;
	}
	@Override
	public String toString() {
		return "Classroom [section=" + section + ", srNo=" + srNo + "]";
	}

	static void display() {
		System.out.println("section is "+section);
		System.out.println("sr No is "+srNo);
	}
	
	
}
