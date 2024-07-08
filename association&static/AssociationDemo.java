package com.Association;

public class AssociationDemo {
	public static void main(String[] args) {
	Bank bank=new Bank("SBI");
	Employee emp=new Employee(1,"pallavi",bank);
	System.out.println(emp);

	}
}
