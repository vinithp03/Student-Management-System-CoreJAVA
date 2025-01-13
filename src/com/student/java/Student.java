package com.student.java;

public class Student {
	
	private String name;
	private int rollnumber;
	private int age;
	private String gender;
	static String CollegeName="MIT College Of Engineering";
	
	public Student(String name, int rollnumber, int age, String gender) {
		this.name = name;
		this.rollnumber = rollnumber;
		this.age = age;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
