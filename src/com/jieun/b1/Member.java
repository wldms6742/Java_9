package com.jieun.b1;

import java.util.Scanner;

public class Member {
	private String name;
	private int age;
	private String sex;
	private double weight;
	private double height;
	private String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(phone);
		
	}
}
