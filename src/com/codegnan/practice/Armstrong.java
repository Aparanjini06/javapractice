package com.codegnan.git;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int temp = num;
		int temp1=num;
		int reverse = 0;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		while (temp != 0) {
			int remainder = temp % 10;
			reverse +=Math.pow(remainder,count);
			temp = temp / 10;
		}
		
		String result=(temp1==reverse)?"Armstrong":"not Armstrong";
		System.out.println(result);
		s.close();
	}
}
