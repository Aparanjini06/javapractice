/*Vending Machine Menu System
Question:
A vending machine provides customers with different food and beverage options. The customer selects an item by entering a number from the menu.
Menu:
• 1 → Coke
• 2 → Pepsi
• 3 → Water
• 4 → Snickers
• 5 → Exit
If the customer enters an invalid option, display an error message.
Write a Java program using a switch statement to simulate the vending machine.
Input Format:
The input consists of an integer representing the menu choice.
Output Format:
Display the selected item or an appropriate message.
Sample Test Cases
Test Case 1
Input:
 1
Output:
 You have selected Coke. Enjoy your drink!
Test Case 2
Input:
 3
Output:
 You have selected Water. Enjoy your drink!
Test Case 3
Input:
 4
Output:
 You have selected Snickers. Enjoy your snack!
Test Case 4
Input:
 5
Output:
 Thank you for using the Vending Machine. Have a nice day!*/
package com.codegnan.practice;

import java.util.Scanner;

public class VendingMenu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("You have selected Coke. Enjoy your drink!");
			break;
		case 2:
			System.out.println("You have selected Pepsi. Enjoy your drink!");
			break;
		case 3:
			System.out.println("You have selected Water. Enjoy your drink!");
			break;
		case 4:
			System.out.println("You have selected Snickers. Enjoy your drink!");
			break;
		case 5:
			System.out.println("Thank you for using the Vending Machine. Have a nice day!");
			break;
		}
		s.close();
	}

}
