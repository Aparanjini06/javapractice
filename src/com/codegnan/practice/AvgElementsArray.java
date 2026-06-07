package com.codegnan.git;

import java.util.Scanner;

public class AvgElementsArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int num=s.nextInt();
		int []a=new int[num];
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter element at position "+(i+1));
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		System.out.println("the average of the elements in an array:"+(total)/a.length);
		s.close();
	}

}
