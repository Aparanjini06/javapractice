/*12. Leap Year Verification
Question:
A calendar management application must determine whether a given year is a leap year to correctly calculate the number of days in February.
Write a Java program that checks whether a year is a leap year using nested ternary operators.
Test Case 1
Input:
 2024
Output:
 2024 is Leap Year
Test Case 2
Input:
 2023
Output:
 2023 is Not a Leap Year
Test Case 3
Input:
 1900
Output:
 1900 is Not a Leap Year
Test Case 4
Input:
 2000
Output:
 2000 is Leap Year*/
package com.codegnan.practice;
import java.util.Scanner;

public class LeapYearNestedT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		String result=((year%4==0 || year%400==0 )&& year%100!=0)?year+" is a Leap Year":year+" is not a Leap Year";
		System.out.println(result);
		s.close();
	}

}
