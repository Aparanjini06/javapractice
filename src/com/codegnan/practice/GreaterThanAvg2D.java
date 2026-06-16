package com.codegnan.practice;

import java.util.Scanner;

public class GreaterThanAvg2D {

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
		
		int total=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				total+=arr[i][j];
			}
		}
		int avg=total/(r*c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]>avg)
				{
					System.out.println(arr[i][j]);
				}
				
			}
		}
		s.close();
	}

}
