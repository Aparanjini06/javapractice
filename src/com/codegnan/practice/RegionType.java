/*14. Regional Tax Calculator
Question:
A government taxation department calculates income tax based on the taxpayer's region. Each region has a different tax percentage.
Tax Rates:
• Region Code 1 (North) → 5%
• Region Code 2 (South) → 6%
• Region Code 3 (East) → 7%
• Region Code 4 (West) → 8%
If the user enters an invalid region code, display "Invalid Region".
Write a Java program using a switch statement to calculate and display the tax amount.
Input Format:
Two integers representing:
• Region Code
• Income
Output Format:
Display the tax amount or "Invalid Region".

Sample Test Case 1
Input:
 1 10000
Output:
 500

Sample Test Case 2
Input:
 2 20000
Output:
 1200

Sample Test Case 3
Input:
 4 50000
Output:
 4000

Sample Test Case 4
Input:
 8 10000
Output:
 Invalid Region*/
package com.codegnan.practice;

import java.util.Scanner;

public class RegionType {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		int salary=s.nextInt();
		double discount=0;
		switch(ch)
		{
		case 1:
			discount=salary*0.05;
			System.out.println((int)discount);
			break;
		case 2:
			discount=salary*0.06;
			System.out.println((int)discount);
			break;
		case 3:
			discount=salary*0.07;
			System.out.println((int)discount);
			break;
		case 4:
			discount=salary*0.08;
			System.out.println((int)discount);
			break;
		default:
			System.out.println("Invalid Region");
			break;
		}
		s.close();
	}

}
