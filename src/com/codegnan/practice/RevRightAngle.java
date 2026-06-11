package com.codegnan.practice;
import java.util.Scanner;

public class RevRightAngle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
