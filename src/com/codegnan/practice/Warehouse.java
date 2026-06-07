/*A warehouse manager calculates the final value of an order by adding a 10% tax to the base cost (price multiplied by quantity). Write a program to calculate this final value and check if the order is valid. The order is valid only if the final value is within the given budget and the quantity is at least 1.
Constraints
0.0 <= unitPrice <= 1000.0
0 <= quantity <= 1000
0.0 <= budget <= 2000000.0
Input Format
Three lines representing unit price (double), quantity (int), and budget (double).
Output Format
The final cost followed by the validity result (true/false) on new lines.
Sample Test Cases
Input
50.0
4
200.0
Expected Output
220.0
false
Input
10.0
0
100.0
Expected Output
0.0
false
Input
1000.0
1000
1100000.0
Expected Output
1100000.0
true
Input
1.0
1
1.1
Expected Output
1.1
true*/
package com.codegnan.git;

import java.util.Scanner;

public class Warehouse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double price=s.nextDouble();
		int quantity =s.nextInt();
		double budget = s.nextDouble();
		double dicount = (price*quantity)*0.10;
		double amount= (price*quantity)+dicount;
		boolean isUnderBudget =amount>=budget;
		System.out.println(amount);
		System.out.println(isUnderBudget);
		s.close();
	}

}
