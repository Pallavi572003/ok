package com.Profile;

public class Profile {
	private String name;
	private int age;
	protected String mobilenumber;
	public String email;
	public Profile(String name,int age,String mobilenumber,String email) {
		this.name=name;
		this.age=age;
		this.mobilenumber=mobilenumber;
		this.email=email;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	protected String getMobilenumber() {
		return mobilenumber;
	}
	protected void setMobilenumber(String String) {
		this.mobilenumber = String;
	}
	
	public void displayprofile() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobilenumber);
		System.out.println("Email: "+email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile p=new Profile("Pallavi",29,"9876543210","Pallavi@gmail.com");
		p.displayprofile();
		p.setName("P");
		p.setAge(15);
		p.setMobilenumber("9876543210");
		p.setEmail("P123@gmail.com");
		System.out.println("Updated Profile of the Person: ");
		p.displayprofile();

	}

}
