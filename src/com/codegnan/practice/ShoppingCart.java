/*An e-commerce company wants to automate its billing system. The final payable amount depends on the shopping cart value, festival offers, and premium membership benefits.
The discount rules are:
• If the cart total is ₹10,000 or more, apply a 20% discount.
• Otherwise, if the cart total is ₹5,000 or more, apply a 10% discount.
• Otherwise, no cart discount is applied.
• If it is a festival season, apply an additional 5% discount on the cart total.
• If the customer is a premium member, apply an additional flat discount of ₹200.
Write a Java program that accepts the cart total, festival season status, and premium membership status from the user and calculates the final payable amount.
Input Format:
The first line contains a double value representing the cart total.
The second line contains a boolean value representing whether it is a festival season (true/false).
The third line contains a boolean value representing whether the customer is a premium member (true/false).
Output Format:
Display:
• Initial Amount
• Cart Discount
• Festival Discount
• Premium Member Discount
• Total Payable Amount

Sample Test Case 1
Input:
 12000
 true
 true
Output:
 Initial Amount: ₹12000.0
 Discount (20%): ₹2400.0
 Festival Discount (5%): ₹600.0
 Premium Member Discount: ₹200.0
 Total Payable: ₹8800.0

Sample Test Case 2
Input:
 7000
 true
 false
Output:
 Initial Amount: ₹7000.0
 Discount (10%): ₹700.0
 Festival Discount (5%): ₹350.0
 Premium Member Discount: ₹0.0
 Total Payable: ₹5950.0

Sample Test Case 3
Input:
 4000
 false
 true
Output:
 Initial Amount: ₹4000.0
 Discount (0%): ₹0.0
 Festival Discount (5%): ₹0.0
 Premium Member Discount: ₹200.0
 Total Payable: ₹3800.0*/
package com.codegnan.practice;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cart = s.nextInt();
		boolean isSeason = s.nextBoolean();
		boolean isPremium = s.nextBoolean();
		double total = 0;
		double discount = 0;
		System.out.println("Initial Amount: " + (double) cart);
		if (cart >=10000) {
			discount = cart * 0.20;
			total = cart - discount;
			System.out.println("Discount: (20%):" + discount);
		} else {
			if (cart >= 5000) {
				discount = cart * 0.10;
				total = cart - discount;
				System.out.println("Discount: (5%):" + discount);
				
			} else {
				System.out.println("Discount: (0%):" + total);
			}
		}
		double festAmount = 0;
		if (isSeason) {
			festAmount = (cart * 0.05);
			System.out.println("Festival Discount(5%): " + festAmount);
		} else {
			System.out.println("Festival Discount(0%): " + festAmount);
		}
		double premiumAmount = 0;
		if (isPremium) {
			premiumAmount = 200.0;

			System.out.println("Premium Member Discount: " + premiumAmount);
		} else {
			
			System.out.println("Premium Member Discount: " + premiumAmount);
		}
		total = total - festAmount - premiumAmount;
		System.out.println("Total Payable: " + total);
		s.close();
	}

}
