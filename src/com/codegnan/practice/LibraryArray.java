package com.codegnan.practice;

import java.util.Scanner;

public class LibraryArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[]=new int[row];
		for(int i=0;i<row;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<col;i++)
		{
			int l=s.nextInt();
			int r=s.nextInt();
			int t=s.nextInt();
			int sum=0;
			for(int j=l-1;j<=r-1;j++)
			{
				sum+=arr[j];
			}
			if(sum>t)
			{
				System.out.println(t);
			}
			else {
				System.out.println(sum);
			}
		}
		s.close();
	}
}
