/* Arithmetic Operations Calculator
Question:
A calculator application allows users to perform basic arithmetic operations on two numbers.
Menu:
• 1 → Addition
• 2 → Subtraction
• 3 → Multiplication
• 4 → Division
If the user selects division, the program must check for division by zero.
Write a Java program using a switch statement to perform the selected operation.
Input Format:
The first line contains a double value representing the first number.
The second line contains a double value representing the second number.
The third line contains an integer representing the operation choice.
Output Format:
Display the result of the selected operation.

Sample Test Case 1
Input:
 10
 20
 1
Output:
 Result: 10.0 + 20.0 = 30.0

Sample Test Case 2
Input:
 50
 20
 2
Output:
 Result: 50.0 - 20.0 = 30.0

Sample Test Case 3
Input:
 10
 5
 3
Output:
 Result: 10.0 * 5.0 = 50.0

Sample Test Case 4
Input:
 20
 0
 4
Output:
 Error: Division by zero is not allowed.*/
package com.codegnan.practice;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextInt();
		double b=s.nextInt();
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Result: "+a+" + "+b+" = "+(a+b));
			break;
		case 2:
			System.out.println("Result: "+a+" - "+b+" = "+(a-b));
			break;
		case 3:
			System.out.println("Result: "+a+" * "+b+" = "+(a*b));
			break;
		case 4:
			if(b==0)
			{
				System.out.println("Error: Division by zero is not allowed.");
			}
			else {
			System.out.println("Result: "+a+" / "+b+" = "+(a/b));}
			break;
		}
		s.close();
	}

}
