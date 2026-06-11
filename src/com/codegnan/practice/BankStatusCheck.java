/*13. Bank Account Status Check
Question:
A bank wants to categorize customer accounts based on their available balance.
• Good Standing if balance is ₹1000 or more
• Low Balance if balance is between ₹500 and ₹999
• Account Overdrawn if balance is less than ₹500
Write a Java program that determines the account status using nested ternary operators.
Test Case 1
Input:
 1500
Output:
 Your account is in: Good Standing
Test Case 2
Input:
 750
Output:
 Your account is in: Low Balance
Test Case 3
Input:
 500
Output:
 Your account is in: Low Balance
Test Case 4
Input:
 300
Output:
 Your account is in: Account Overdrawn*/
package com.codegnan.practice;
import java.util.Scanner;

public class BankStatusCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bank=s.nextInt();
		String result=(bank>=1000)?"Your account in: Good Standing":(bank>=500)?"Your account is in: Low Balance":"Your account is in: Account Overdrawn";
		System.out.println(result);
		s.close();
	}

}
