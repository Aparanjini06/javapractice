package com.codegnan.practice;
import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		
		int square=num*num;
		while(square!=0)
		{
			int lastDigit=square%10;
			sum+=lastDigit;
			square=square/10;
		}
		if(sum==num) {
			System.out.println(num+" is a neon number");
		}
		else {
			System.out.println(num+" is not a neon number");
		}
		s.close();
	}

}
