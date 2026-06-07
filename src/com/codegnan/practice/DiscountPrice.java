/*A shopkeeper calculates the final cost of an item by applying a discount and adding a surcharge. Read the initial price, discount amount, surcharge amount, and a target budget from the user. Use assignment operators to update the price and print the final cost, then print 'true' if the final cost is both greater than zero and less than or equal to the budget.
Constraints
0 <= Price, Discount, Surcharge, Budget <= 10^6
Total Time Limit: 2s
Input Format
Four integers (Initial Price, Discount, Surcharge, Budget) each on a new line.
Output Format
The updated final cost and the logical check result (true/false) on separate lines.
Sample Test Cases
Input
50
10
5
40
Expected Output
45
false
Input
200
50
25
180
Expected Output
175
true
Input
10
15
2
20
Expected Output
-3
false
Input
1000000
0
0
1000000
Expected Output
1000000
true*/
package com.codegnan.git;

import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double price=s.nextDouble();
		double discount=s.nextDouble();
		double subCharge=s.nextDouble();
		double target= s.nextDouble();
		double totalAmount= (price-discount)+subCharge;
		boolean isOk= totalAmount>=0 && totalAmount <=target;
		System.out.println(isOk);
		s.close();
	}

}
