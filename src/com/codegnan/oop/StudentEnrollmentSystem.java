package com.codegnan.oop;

import java.util.Scanner;

public class StudentEnrollmentSystem {
	int rollNumber;
	String name;
	public StudentEnrollmentSystem(int rollNumber,String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		
	}
	public void display() {
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rollNumber=sc.nextInt();
		String name=sc.next();
		StudentEnrollmentSystem student=new StudentEnrollmentSystem(rollNumber,name);
		student.display();
		sc.close();
	}
}
