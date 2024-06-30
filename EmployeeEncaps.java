package com.EmployeeEncaps;

public class EmployeeEncaps {

		public static void main(String[] args) {
		Employee EmpObj= new Employee(); //object of the class Employee
		//passing the values to the methods using object
		EmpObj.setEmpName("Anna");
		EmpObj.SetEmpSal(30000);
		EmpObj.setEmpID(670311);
		// Printing values of the variables
		System.out.println("Employee's Name: " + EmpObj.getEmpName());
		System.out.println("Employee's ID: " + EmpObj.getEmpID());
		System.out.println("Employee's Salary: " + EmpObj.getEmpSal());
		}
		
}
