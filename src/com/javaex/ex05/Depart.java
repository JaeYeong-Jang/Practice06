package com.javaex.ex05;

public class Depart extends Employee {

	//코드작성
	
	//fields
	private String department;
	
	//constructors
	public Depart() {
		
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	//method g/s
	public String getDepart() {
		return department;
	}

	public void setDepart(String depart) {
		this.department = depart;
	}
	
	//method
	public void showInformation() {
		System.out.println("이름 : " + super.getName() + ", 연봉 : " + super.getSalary() + ", 부서 : " + this.department);
		
	}
}
