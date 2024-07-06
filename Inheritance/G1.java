package com.Multilevel;

public class G1 {
	private int version;
	public int year;
	
	protected int getVersion() {
		return version;
	}


	protected void setVersion(int version) {
		this.version = version;
	}


	protected int getYear() {
		return year;
	}


	protected void setYear(int year) {
		this.year = year;
	}


	public void voice() {
		System.out.println("Only For Voice Calls");
	}


	@Override
	public String toString() {
		return "G1 [version=" + version + ", year=" + year + ", getVersion()=" + getVersion() + ", getYear()="
				+ getYear() + "]";
	}
}


