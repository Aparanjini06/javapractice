package com.codegnan.practice;

import java.util.Scanner;

public class FirstRowJagged {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int arr[][]=new int[r][];
		for(int i=0;i<r;i++)
		{
			int c=s.nextInt();
			arr[i]=new int[c];
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0)
				{
					System.out.print(arr[i][j]+" ");
				}
				
			}
			
		}
		s.close();
	}

}
