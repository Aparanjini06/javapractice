package com.codegnan.git;
// to check each and every element in an array are palindrome or not

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the elements in an array:");
		int num=s.nextInt();
		int []a=new int[num];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the elements at position "+i+" ");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			int temp=a[i];
			while(a[i]!=0)
			{
				int lastDigit=a[i]%10;
				sum=sum*10+lastDigit;
				a[i]=a[i]/10;
			}
			if(sum==temp)
			{
				System.out.println("the element "+temp+" is palindrome");
			}
			else {
				System.out.println("The element "+temp+" is not palindrome");
			}
		}
		s.close();
	}

}
