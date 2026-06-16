/*You are given an integer array nums that represents a sequence of numbers. Your task is to move all the zeros in the array to the end while maintaining the relative order of the non-zero elements. You must perform this operation in-place without using any extra space.
 
Input Format:
The first line contains an integer n, representing the size of the array.
The second line contains n space-separated integers representing the elements of the array nums.
 
Output Format
Print the modified array after all zeros have been moved to the end. The array is printed with each element separated by a space.
 
Sample Test Cases
Test Case 1
 Expected Output
Enter the Size of Array :
6
Enter Array Elements :
0 2 3 1 3 0
Modified Array : 2 3 1 3 0 0
 
 
Test Case 2
Expected Output
Enter the Size of Array :
4
Enter Array Elements :
0 2 0 1
Modified Array : 2 1 0 0
 
 
Test Case 3
Expected Output
Enter the Size of Array :
7
Enter Array Elements :
4 5 6 0 8 0 9
Modified Array: 4 5 6 8 9 0 0*/
package com.codegnan.practice;

import java.util.Scanner;

public class ZeroAtEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n=s.nextInt();
		System.out.println("Enter Array Elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<n)//3<5
		{
			arr[index]=0;
			index++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
