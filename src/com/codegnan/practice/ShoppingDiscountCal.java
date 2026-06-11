/*11. Shopping Discount Calculator
Question:
A supermarket offers discounts based on the customer's total purchase amount.
• 20% discount if the amount is ₹1000 or more
• 10% discount if the amount is between ₹500 and ₹999
• No discount if the amount is less than ₹500
Write a Java program that calculates the discount and final payable amount using nested ternary operators.
Test Case 1
Input:
 1200
Output:
 You get a discount of: 240.0
 Total after discount: 960.0
Test Case 2
Input:
 800
Output:
 You get a discount of: 80.0
 Total after discount: 720.0
Test Case 3
Input:
 500
Output:
 You get a discount of: 50.0
 Total after discount: 450.0
Test Case 4
Input:
 300
Output:
 You get a discount of: 0.0
 Total after discount: 300.0*/

package com.codegnan.practice;
import java.util.Scanner;

public class ShoppingDiscountCal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int amount=s.nextInt();
		double discount =(amount>=1000)?amount*0.2:(amount>=500)?amount*0.1:0;
		System.out.println("You get a discount of: "+discount);
		double totalAmount = amount+discount;
		System.out.println("Total after discount: "+totalAmount);
		s.close();
	}

}
