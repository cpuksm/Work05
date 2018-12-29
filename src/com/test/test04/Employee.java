package com.test.test04;

public class Employee extends Person {

	private String dept;
	
	@Override
	public void print() {
		System.out.println("이름: "+ getName()+", 나이: "+ getAge()+", 직급:"+getDept());
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
