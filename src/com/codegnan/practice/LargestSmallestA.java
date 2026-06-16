/*Largest and smallest element of an array
=================================

Problem Statement
A data analysis system stores N integer values in an array. Write a program to find and display the largest and smallest elements present in the array.

Constraints
1 <= N <= 1000
-100000 <= Array Elements <= 100000

Input Format
The first line contains an integer N representing the size of the array.
The second line contains N space-separated integers.

Output Format
Print the smallest element followed by the largest element.

Test Case-1
Input
5
10 20 5 40 15
Output
Smallest Element: 5
 Largest Element: 40
Explanation
Array Elements:
10 20 5 40 15
Smallest = 5
Largest = 40

Test Case-2
Input
4
-10 -20 -5 -40
Output
Smallest Element: -40
 Largest Element: -5
Explanation
Array Elements:
-10 -20 -5 -40
Smallest = -40
Largest = -5

Test Case-3
Input
6
100 1000 50 500 20 200
Output
Smallest Element: 20
 Largest Element: 1000*/
package com.codegnan.practice;

import java.util.Scanner;

public class LargestSmallestA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int[] a = new int[row];
		for (int i = 0; i < row; i++) {
			a[i] = s.nextInt();

		}
		int min = a[0];
		int max = a[0];

		for (int i = 0; i < row; i++) {

			if (a[i] < min)// 1 2 3 4 2
			{
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println("Smallest Element:"+min);
		System.out.println("Largest Element:"+max);
		s.close();
	}

}
