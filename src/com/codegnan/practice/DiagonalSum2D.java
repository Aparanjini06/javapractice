package com.codegnan.practice;

import java.util.Scanner;

public class DiagonalSum2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int [][]arr=new int[r][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(arr[i]==arr[j] )
				{
					sum+=arr[i][j];
				}
				if(arr[j]==arr[i])
				{
					sum+=arr[j][i];
				}
			}
		}
		
		System.out.println(sum);
		s.close();
	}

}
