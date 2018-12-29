package com.test.test04;

public class Teacher extends Person {

	private String subjecct;
	
	@Override
	public void print() {
		System.out.println("이름: " + getName()+ ", 나이: " + getAge()+", 과목:" + getSubjecct());

	}

	public Teacher(String name, int age, String subjecct) {
		super(name, age);
		this.subjecct = subjecct;
		
	}

	public String getSubjecct() {
		return subjecct;
	}

	public void setSubjecct(String subjecct) {
		this.subjecct = subjecct;
	}

}
