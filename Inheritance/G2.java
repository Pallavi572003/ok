package com.Multilevel;

public class G2 extends G1 {
	private int version;
	public int year;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "G2 [version=" + version + ", year=" + year + ", getVersion()=" + getVersion() + ", getYear()="
				+ getYear() + "]";
	}
	public void message() {
		System.out.println("Voice Calls & Text Messages");	
	}
}
