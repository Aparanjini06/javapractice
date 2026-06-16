package com.codegnan.practice;

import java.util.Scanner;

public class CountRowEvenNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int arr[][]=new int[r][];
		int count=0;
		for(int i=0;i<r;i++)
		{
			int c=s.nextInt();
			if(c%2==0)
			{
				count++;
			}
			arr[i]=new int[c];
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println(count);
		s.close();
	}

}
