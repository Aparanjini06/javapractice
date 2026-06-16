package com.codegnan.practice;

import java.util.Scanner;

public class SumLastCol2D {

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
			
				sum+=arr[i][c-1];
			
		}
		System.out.println(sum);
		s.close();
	}

}
