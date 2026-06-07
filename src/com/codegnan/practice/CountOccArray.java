package com.codegnan.git;
//count occurrence element in an array
import java.util.Scanner;

public class CountOccArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int num=s.nextInt();
		int[] a=new int[num];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter element at position "+(i+1));
			a[i]=s.nextInt();
		}
		System.out.println("Enter target element:");
		int target=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(target==a[i]) {
				c++;
			}
		}
		System.out.println("count of "+target+" is "+c);
		s.close();
	}

}
