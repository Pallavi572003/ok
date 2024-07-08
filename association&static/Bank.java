package com.Association;

public class Bank {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bank(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}
	

}
