package com.codegnan.practice;

import java.util.Scanner;

public class SumJaggedA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int [][]arr=new int[r][];
		for(int i=0;i<r;i++)
		{
			int c=s.nextInt();
			arr[i]=new int[c];
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
			
		}
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		s.close();
	}

}
