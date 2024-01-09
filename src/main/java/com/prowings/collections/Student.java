package com.prowings.collections;

public class Student implements Comparable<Student>{
	
	private int rollNumber;
	private String name;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.rollNumber == o.rollNumber)
			return 0;
		else if(this.rollNumber > o.rollNumber)
			return 4;
		else
			return -3;
		
		
	}
	
	

}
