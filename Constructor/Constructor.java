package com.Constructor;

public class Constructor {
	    private int age;
	    private String gender;
	    private double income;

	    public Constructor(int age, String gender, double income) {
	        this.age = age;
	        this.gender = gender;
	        
	        if (age >= 65 || (gender.equalsIgnoreCase("female") && age >= 65) ||
	            (age < 65 && gender.equalsIgnoreCase("male") && income < 1500000)) {
	            this.income = 0;
	        } else {
	            this.income = income;
	        }
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public double getIncome() {
	        return income;
	    }

	    public void setIncome(double income) {
	        this.income = income;
	    }

	    // toString method to represent object as a string
	    @Override
	    public String toString() {
	        return "Constructor{" +
	                "age=" + age +
	                ", gender='" + gender + '\'' +
	                ", income=" + income +
	                '}';
	    }


	    // Example usage in main method
	    public static void main(String[] args) {
	        Constructor c1 = new Constructor(90, "female", 2000000);
	        Constructor  c2 = new Constructor(60, "male", 2000000);

	        System.out.println("Constructor 1: " + c1);
	        System.out.println("Constructor 2: " + c2);
	    }
	}


