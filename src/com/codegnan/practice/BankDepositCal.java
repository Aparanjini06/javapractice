package com.codegnan.practice;
import java.util.Scanner;

public class BankDepositCal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int amount = s.nextInt();
		int deposit = s.nextInt();
		
		amount+=deposit;//assignment operator
		
		boolean isEvenAndGreater1000 = (amount>=1000)&&(amount%2==0);
		System.out.println(amount);
		System.out.println(isEvenAndGreater1000);
		s.close();
	}

}
