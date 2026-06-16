/*You have been given an array a[ ] of n unique non-negative integers. Write a function to find the second largest and second smallest elements in the array. Return these two elements as another array of size 2.
 
Input Format:
An integer n, the size of the array.
An array a[ ] of n unique non-negative integers.
 
Output Format:
An array of size 2 containing the second largest and second smallest elements.
 
Sample Test Cases
Test Case 1
 Expected Output
Enter the Size of the Array :
4
Enter the array Elements :
3 4 5 1
Second Largest and Second Smallest Elements : 4 3

Test Case 2
Expected Output
Enter the Size of the Array :
5
Enter the array Elements :
4 5 3 6 7
Second Largest and Second Smallest Elements : 6 4
 
Test Case 3
Expected Output
Enter the Size of the Array :
5
Enter the array Elements :
10 20 30 40 50
Second Largest and Second Smallest Elements : 40 20
*/
package com.codegnan.practice;
import java.util.Scanner;

public class SecondLargestSmall {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int row=s.nextInt();
		System.out.println("Enter the array Elements :");
		int []a=new int[row];
		for(int i=0;i<row;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int secSmall=0,secLargest=0;
		for(int i=0;i<row;i++)
		{
			 secSmall=a[1];
			 secLargest=a[row-2];
			//System.out.println("second smallest element:"+a[i+1]);
			//System.out.println("second largest element:"+a[row-1]);
		}
		System.out.println("Second Largest and Second Smallest Elements: "+secLargest+" "+secSmall);
		
		s.close();
	}

}
