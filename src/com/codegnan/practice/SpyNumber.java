package com.codegnan.git;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int product=1;
		int sum=0;
		while(num!=0) {
			int remainder=num%10;
			sum+=remainder;
			product*=remainder;
			num/=10;
		}
		if(sum==product) {
		System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}
		s.close();
	}

}
