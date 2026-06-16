package com.codegnan.practice;

import java.util.Scanner;

public class CountGreaterThanXJagged {

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
		int count=0;
		int x=s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>x)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		s.close();
	}

}
