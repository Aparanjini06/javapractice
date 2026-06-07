package com.codegnan.git;

import java.util.Scanner;

public class LargestSmallestA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int []a=new int[row];
		for (int i=0;i<row;i++)
		{
			a[i]=s.nextInt();
			
		}
		int min=0;
		int max=0;
		
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				if(a[i]<min)//1 2 3 4 2 
				{
					min=a[i];
				}
				if(a[i]>max)
				{
					max=a[i];
			}
			}
		}
		System.out.println(min);
		System.out.println(max);
		s.close();
	}

}
