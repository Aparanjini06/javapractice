/*A dairy company uses an automated milk quality management system to monitor the composition of milk and water in storage containers.
Initially, a container contains milk and water in a certain ratio.
 To adjust the concentration, some quantity of the mixture is removed and replaced with pure water.
After replacement, the ratio of milk and water changes.
Write a Java program that accepts:
Initial milk ratio
Initial water ratio
Quantity of mixture replaced
Final milk ratio
Final water ratio
from the end user and calculates the total capacity of the container.
Input Format 
Enter Initial Milk Ratio
Enter Initial Water Ratio
Enter Quantity of Mixture Replaced
Enter Final Milk Ratio
Enter Final Water Ratio

Output Format 
Container Capacity: X liters

Constraints 
1 <= Ratio Values <= 100
1 <= Replaced Quantity <= 1000

Hint to Solve the Problem
Calculate the initial milk fraction using:
                            Initial Milk Ratio 
Initial Milk Fraction=  —-------------------------
                                      Initial Water RatioInitial Milk Ratio​ 

2. Calculate the final milk fraction using: 
      
                                           Final Milk Ratio
 Final Milk Fraction=        —-----------------------
                                         Final Water RatioFinal Milk Ratio​

3. Use the mixture replacement formula to find the container capacity: 

                             1−(Initial Milk FractionFinal Milk Fraction​)
Capacity=          —-----------------------------------------------------
                              (Final Milk Fraction)
                       1-   —-----------------------
                              (Initial milk Fraction​)

Sample Test Case 1
Input
5
3
16
3
5
Output 
Container Capacity: 64 liters
Sample Test Case 2
Input
7
5
24
7
11
Output 
Container Capacity: 96 liters*/
package com.codegnan.git;

import java.util.Scanner;

public class MilkManagement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int initialMilk = s.nextInt();
		int initialWater = s.nextInt();
		double replace = s.nextDouble();
		int finalMilk = s.nextInt();
		int finalWater = s.nextInt();

		double initialMilkFraction = (double) initialMilk / (initialMilk + initialWater);

		double finalMilkFraction = (double) finalMilk / (finalMilk + finalWater);

		double capacity = replace / (1 - (finalMilkFraction / initialMilkFraction));

		System.out.println("Container Capacity: " + (int) capacity + " liters");

		s.close();
	}
}