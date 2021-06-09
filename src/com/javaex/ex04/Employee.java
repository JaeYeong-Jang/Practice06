package com.javaex.ex04;

public class Employee extends User {

	//fields
	private int salary;
	
	//constructors
	public Employee() {
		
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id,password,name);
		this.salary = salary;
		
	}
	//method g/s
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//method
	public void showInfo() {
		System.out.println("#아이디 : " + id + ", #패스워드 : " + password + ", #이름 : " + name + ", #월급 : " + this.salary);
		System.out.println(name + "의 월급은 " + this.salary + "원 입니다.");
	}
	
}
