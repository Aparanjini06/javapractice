/*8. Second Largest Number Finder
Question:
A ranking system receives scores from three participants and needs to determine the second-highest score.
Write a Java program that accepts three integers and finds the second largest number using nested ternary operators.
Test Case 1
Input:
 10 20 30
Output:
 Second largest: 20
Test Case 2
Input:
 50 20 40
Output:
 Second largest: 40
Test Case 3
Input:
 100 300 200
Output:
 Second largest: 200
Test Case 4
Input:
 80 60 70
Output:
 Second largest: 70*/
package com.codegnan.git;

import java.util.Scanner;

public class RankingSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int s1=s.nextInt();
		int s2=s.nextInt();
		int s3=s.nextInt();
		int secondLargest = (s1>s2&&s1>s3)?(s2>s3?s2:s3):((s2>s1&&s2>s3)?(s1>s3?s1:s3):(s1>s2?s1:s2));
		System.out.println(secondLargest);
		s.close();
	}
//20>60 10    10>20 30   20>10 30
}
