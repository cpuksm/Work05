package com.test.test04;

public class Student extends Person {
 private int id;


	@Override
	public void print() {
		System.out.println("�̸�:"+ getName()+", ����"+ getAge()+ ", �й�  :"+getId());
	}


	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
		
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
