package com.codegnan.oop;

import java.util.Scanner;

public class FitLife {
	int totalHours;
	int hours;
	String type;
	public static int caloriesBurned(int totalHours)
	{
		
		int calories=totalHours*100;
		if(calories>1000)
		{
			calories=1000;
		}
		return calories;
		
	}
	public int caloriesnonStatic(int hours,String type)
	{
		int calories=0;
		if(type.equalsIgnoreCase("cardio"))
		{
			calories= hours*120;
		}
		if(type.equalsIgnoreCase("strength"))
		{
			calories= hours*80;
		}
		if(calories>1000)
		{
			calories=1000;
		}
		return calories;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalHours=sc.nextInt();
		int hours=sc.nextInt();
		String type=sc.next();
		System.out.println(FitLife.caloriesBurned(totalHours));
		FitLife fl=new FitLife();
		System.out.println(fl.caloriesnonStatic(hours, type));
		
		sc.close();
	}
}
