package com.codegnan.practice;

import java.util.Scanner;

public class Double2D {

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
		
		int total[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				total[i][j]=arr[i][j]+arr[i][j];
				System.out.print(total[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
