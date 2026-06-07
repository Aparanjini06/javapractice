package com.codegnan.git;
//sum of odd and even number in an array
import java.util.Scanner;

public class SumOddEvenArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int num=s.nextInt();
		int []a=new int[num];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter element at position:"+(i+1));
			a[i]=s.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even+=a[i];
			}
			else {
				odd+=a[i];
			}
		}
		System.out.println("the sum of even numbers in an array "+even);
		System.out.println("the sum of odd numbers in an array "+odd);
		s.close();
	}

}
