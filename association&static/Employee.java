package com.Association;

public class Employee {
	private int empid;
	private String ename;
	private Bank bank;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Employee(int empid, String ename, Bank bank) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", bank=" + bank + "]";
	}

	

}
