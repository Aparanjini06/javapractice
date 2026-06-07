package com.codegnan.git;

import java.util.Scanner;

public class RevLeftAngle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=row;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
