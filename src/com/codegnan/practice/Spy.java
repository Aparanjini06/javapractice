package com.codegnan.practice;
import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int product=1;
		int sum=0;
		int temp1=num;
		int temp=num;
		while(num!=0) {
			int lastDigit=num%10;
			sum+=lastDigit;
			num=num/10;
		}
		while(temp!=0) {
			int lastDigit=temp%10;
			product*=lastDigit;
			temp=temp/10;
		}
		if(sum==product) {
		System.out.println(temp1+" is a Spy number");
		}
		else {
			System.out.println(temp1+" is Not a spy number");
		}
		s.close();
	}

}
