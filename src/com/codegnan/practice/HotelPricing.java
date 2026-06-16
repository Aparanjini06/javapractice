/*Hotel Room Pricing System
Question:
A hotel management system calculates room charges based on the selected room type and the current season.
Room Types:
• 1 → Standard Room
• 2 → Deluxe Room
Season Types:
• 1 → Peak Season
• 2 → Off-Peak Season
Pricing Details:
• Standard Room during Peak Season → $100
• Standard Room during Off-Peak Season → $80
• Deluxe Room during Peak Season → $200
• Deluxe Room during Off-Peak Season → $150
If the user enters an invalid room type or season type, display "Invalid Input".
Write a Java program using switch statements to determine the room price.
Input Format:
Two integers representing:
• Room Type
• Season Type
Output Format:
Display the room price or "Invalid Input".

Sample Test Case 1
Input:
 1 1
Output:
 $100

Sample Test Case 2
Input:
 1 2
Output:
 $80

Sample Test Case 3
Input:
 2 1
Output:
 $200

Sample Test Case 4
Input:
 5 2
Output:
 Invalid Input*/
package com.codegnan.practice;

import java.util.Scanner;

public class HotelPricing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int room = s.nextInt();
		int season = s.nextInt();
		switch (room) {
		case 1:
			switch (season) {
			case 1:
				System.out.println("$100");
				break;
			case 2:
				System.out.println("$80");
				break;
			default:
				System.out.println("Invalid Input");
			}
			break;
		case 2:
			switch (season) {
			case 1:
				System.out.println("$200");
				break;
			case 2:
				System.out.println("$150");
				break;
			default:
				System.out.println("Invalid Input");
			}
			break;
		default:
			System.out.println("Invalid Input");

		}
		s.close();
	}

}
