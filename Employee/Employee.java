package com.EmployeeEncaps;

public class Employee {

	private String EmpName;
	private int EmpID;
	private int EmpSal;
	
	public int getEmpSal()
	{
		return EmpSal;
	}
	public String getEmpName()
	{
		return EmpName;
	}
	public int getEmpID()
	{
		return EmpID;
	}
	public void SetEmpSal(int EmpSal)
	{
		this.EmpSal=EmpSal;
	}
	public void setEmpName(String EmpName)
	{
		this.EmpName=EmpName;
	}
	public void setEmpID(int EmpID)
	{
		this.EmpID=EmpID;
	}
}
