package com.codegnan.practice;

import java.util.Scanner;

public class SumShortestRow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int arr[][]=new int[r][];
		int min=Integer.MAX_VALUE;
		int sh=0;
		for(int i=0;i<r;i++)
		{
			int c=s.nextInt();
			if(c<min)
			{
				min=c;
				sh=i;
			}
			arr[i]=new int[c];
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for(int j=0;j<arr[sh].length;j++)
		{
			sum+=arr[sh][j];
		}
		System.out.println(sum);
		s.close();
	}

}
