package com.example.demo;

public class Customer {
	
	private String name;
	private String add;
	private String adhar;
	private String pan;
	private int mobile;
	
	void setName(String name) {
		this.name=name;
	}
	
	void setAdd(String add) {
		this.add=add;
	}
	void setAdhar(String adhar) {
		this.adhar=adhar;
	}
	void setPan(String pan) {
		this.pan=pan;
	}
	void setMobile(int mobile) {
		this.mobile=mobile;
	}
	String getName() {
		return name;
	}
	String getAdd() {
		return add;
	}
	String getAdhar() {
		return adhar;
	}
	String getPan() {
		return pan;
	}
	 int getMobile() {
		 return mobile;
	 }

}
