/*3. Positive or Negative Number
Question:
A banking system records transactions. Positive values represent deposits, while negative values represent withdrawals.
Write a Java program that checks whether a given number is positive or negative using the ternary operator.
Test Case 1
Input:
 25
Output:
 Positive
Test Case 2
Input:
 -15
Output:
 Negative*/
package com.codegnan.practice;
import java.util.Scanner;

public class PositiveNegativeT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String res= (num>=0)?"positive":"negative";
		System.out.println(res);
		s.close();
	}

}
