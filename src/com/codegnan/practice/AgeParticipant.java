/*10. Age Group Classification
Question:
A community center organizes activities based on the age of participants. To automate the registration process, the system categorizes people into different age groups:
• Child if age is less than 12
• Teenager if age is between 12 and 19
• Adult if age is between 20 and 64
• Senior if age is 65 or above
Write a Java program that accepts a person's age and determines the appropriate age group using nested ternary operators.
Test Case 1
Input:
 8
Output:
 You are a(n) Child
Test Case 2
Input:
 16
Output:
 You are a(n) Teenager
Test Case 3
Input:
 35
Output:
 You are a(n) Adult
Test Case 4
Input:
 70
Output:
 You are a(n) Senior*/
package com.codegnan.git;

import java.util.Scanner;

public class AgeParticipant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		String result= (age<12)?"You are a(n) Child":(age<19)?"You are a(n) Teenager":(age<64)?"You are a(n) Adult":"You are a(n) Senior";
		System.out.println(result);
		s.close();
	}

}
