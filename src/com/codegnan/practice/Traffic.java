/*A smart traffic management system displays instructions based on the selected traffic signal color.
Options:
• 1 → Red
• 2 → Yellow
• 3 → Green
Write a Java program using a switch statement to display the corresponding traffic instruction.
Input Format:
The input consists of an integer representing the signal option.
Output Format:
Display the traffic instruction.
Sample Test Cases
Test Case 1
Input:
 1
Output:
 Stop
Test Case 2
Input:
 2
Output:
 Get Ready
Test Case 3
Input:
 3
Output:
 Go
Test Case 4
Input:
 5
Output:
 Invalid Signal*/
package com.codegnan.practice;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println("Stop");
		case 2:
			System.out.println("Get Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid signal");
		}
		
		s.close();
	}

}
