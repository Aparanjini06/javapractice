package com.codegnan.practice;

import java.util.Scanner;

public class Sum2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int [][]arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		s.close();
	}

}
