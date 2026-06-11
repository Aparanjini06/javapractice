/*2. Leap Year Checker
Question:
A calendar application needs to identify leap years to correctly calculate the number of days in February.
Write a Java program that checks whether a given year is a leap year and displays the result using the ternary operator.
Test Case 1
Input:
 2024
Output:
 Leap Year
Test Case 2
Input:
 2023
Output:
 Not a Leap Year*/
package com.codegnan.practice;
import java.util.Scanner;

public class LeapYearT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		String result =(year%4==0)?"Leap Year":"Non Leap Year";
		System.out.println(result);
		s.close();
	}

}
