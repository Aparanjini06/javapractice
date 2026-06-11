/*A game developer needs to calculate a player's score by adding a base value and a bonus, then doubling the result using an arithmetic assignment operator. Write a program to calculate this total and check if the final total is greater than 50 and the original bonus was an odd number.
Constraints
1 <= baseScore, bonus <= 1000
Total Time Limit: 2s
Input Format
Two integers representing baseScore and bonus on separate lines.
Output Format
The doubled total score and the boolean result on separate lines.
Sample Test Cases
Input
5
5
Expected Output
20
false
Input
25
2
Expected Output
54
false
Input
30
3
Expected Output
66
true
Input
1000
999
Expected Output
3998
true*/
package com.codegnan.practice;
import java.util.Scanner;

public class BaseScore {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int base=s.nextInt();
		int bonus=s.nextInt();
		int total = (base+bonus)*2;
		boolean isEligible = total>=50 && bonus%2!=0;
		System.out.println(total);
		System.out.println(isEligible);
		s.close();
	}

}
