package com.codegnan.practice;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int digit=0;
		int square=num*num;
		while(num!=0)
		{
			digit++;
			num=num/10;
		}
		int divisor=1;
		for(int i=0;i<digit;i++)
		{
			divisor*=10;
		}
		if(square%divisor==temp)
		{
			System.out.println(temp+"is an Automorphic Number");
		}
		else {
			System.out.println(temp+"is not an Automorphic Number");
			
		}
		s.close();
	}

}
