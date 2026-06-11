/*7. Day of the Week Finder
Question:
A digital calendar application allows users to enter a number corresponding to a day of the week and displays the day name.
The day mapping is:
• 1 → Sunday
• 2 → Monday
• 3 → Tuesday
• 4 → Wednesday
• 5 → Thursday
• 6 → Friday
• 7 → Saturday
If the user enters any other number, display an appropriate error message.
Write a Java program using a switch statement to determine the day of the week.
Input Format:
The input consists of an integer representing the day number.
Output Format:
Display the corresponding day name.
Sample Test Cases
Test Case 1
Input:
 1
Output:
 sunday
Test Case 2
Input:
 4
Output:
 Wedneday
Test Case 3
Input:
 6
Output:
 Friday
Test Case 4
Input:
 9
Output:
 please provide day name between 1-7 numbers :*/
package com.codegnan.practice;

import java.util.Scanner;

public class WeekFinder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("please provide day name between 1-7 numbers");
			break;
		}
		s.close();
	}

}
