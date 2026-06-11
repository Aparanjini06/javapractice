/*15.Number Sign Classification
Question:
A banking application records customer transactions. Positive values represent deposits, negative values represent withdrawals, and zero indicates no transaction occurred.
Write a Java program that accepts a number and determines whether it is Positive, Negative, or Zero using nested ternary operators.
Test Case 1
Input:
 25
Output:
 The number is: Positive
Test Case 2
Input:
 -15
Output:
 The number is: Negative
Test Case 3
Input:
 0
Output:
 The number is: Zero
Test Case 4
Input:
 120
Output:
 The number is: Positive*/
package com.codegnan.practice;
import java.util.Scanner;

public class NumberSign {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=(num>0)?"Positive":(num==0)?"Zero":"Negative";
		System.out.println(result);
		s.close();
	}

}
