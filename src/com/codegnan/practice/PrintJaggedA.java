package com.codegnan.practice;

import java.util.Scanner;

public class PrintJaggedA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[][]=new int[n][];
		for(int i=0;i<n;i++)
		{
			int k=s.nextInt();
			arr[i]=new int[k];
			for(int j=0;j<k;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		s.close();
	}

}
