package com.codegnan.oop;

import java.util.Scanner;

public class GreenwoodHighSchool {
	String name;
	int rollNum;
	int grade;
	public GreenwoodHighSchool(String name,int rollNum,int grade)
	{
		this.name=name;
		this.rollNum=rollNum;
		this.grade=grade;
		
	}
	
	public void display()
	{
		if(name.length()>0)	
		{
			if(rollNum>0)
			{
				if(grade<=12 && grade>=1)
				{
					System.out.println("Name: "+name+", Roll Number: "+rollNum+", Grade: "+grade);
				}
				else {
					System.out.println("Error: Grade level must be between 1 and 12");
				}
			}
			else {
				System.out.println("Error: Roll number must be positive");
			}
		}
		else {
			System.out.println("Name should not be empty");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int rollNum=sc.nextInt();
		int grade=sc.nextInt();
		GreenwoodHighSchool g=new GreenwoodHighSchool(name,rollNum,grade);
		g.display();
		sc.close();
	}
}
