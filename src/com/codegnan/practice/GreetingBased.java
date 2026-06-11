/*14.Greeting Based on Time
Question:
A digital assistant displays greetings based on the current hour of the day.
• Good Morning for 5 AM to 11 AM
• Good Afternoon for 12 PM to 4 PM
• Good Evening for 5 PM to 9 PM
• Good Night for remaining hours
Write a Java program that prints the appropriate greeting using nested ternary operators.
Test Case 1
Input:
 8
Output:
 Good Morning
Test Case 2
Input:
 14
Output:
 Good Afternoon
Test Case 3
Input:
 19
Output:
 Good Evening
Test Case 4
Input:
 23
Output:
 Good Night*/
package com.codegnan.practice;
import java.util.Scanner;

public class GreetingBased {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int time=s.nextInt();
		String result=(time>=5 && time<=11)?"Good Morning":(time>=12 && time<=15)?"Good Afternoon":(time>=17 && time<=21)?"Good Evening":"Good Night";
		System.out.println(result);
		s.close();
	}

}
