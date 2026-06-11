/*19. Income Tax Calculator
Question:
The Income Tax Department wants to automate tax calculations based on annual income.
• If income is less than ₹300,000, tax is 5% of the income.
• If income is between ₹300,000 and ₹1,000,000, tax is 10% of the income.
• If income is greater than ₹1,000,000, tax is 15% of the income.
• Additionally, if the income exceeds ₹2,000,000, a special 1% rebate is applied on the calculated tax amount.
Write a Java program that accepts a person's annual income and calculates the total tax payable using nested ternary operators.
Test Case 1
Input:
 200000
Output:
 Total tax to pay: 10000.0
Test Case 2
Input:
 500000
Output:
 Total tax to pay: 50000.0
Test Case 3
Input:
 1500000
Output:
 Total tax to pay: 225000.0
Test Case 4
Input:
 2500000
Output:
 Total tax to pay: 371250.0*/

package com.codegnan.practice;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int income=s.nextInt();
		double result=(income<300000)?(income*0.05):(income<=1000000)?(income*0.10):(income*0.15);
		if(income>2000000)
		{
			result=result*0.99;
		}
		System.out.println("Total tax to pay: "+result);
		s.close();
	}

}
