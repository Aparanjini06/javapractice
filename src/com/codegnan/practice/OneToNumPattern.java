package com.codegnan.practice;
import java.util.Scanner;

public class OneToNumPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int z=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(z++);
				System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}

}
