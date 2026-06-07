package com.codegnan.git;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int temp=n;
		int square=n*n;
		while(square!=0)
		{
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		if(temp==sum) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a neon number");
		}
		s.close();
	}

}
