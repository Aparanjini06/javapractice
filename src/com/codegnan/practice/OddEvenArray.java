//print odd and even numbers in an array
package com.codegnan.practice;
import java.util.Scanner;

public class OddEvenArray {

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
		System.out.println("the even numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println("the odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		
		s.close();
	}

}
