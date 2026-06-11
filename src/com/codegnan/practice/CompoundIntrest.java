package com.codegnan.practice;
import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter principal amount:");
		double principal = s.nextDouble();
		System.out.println("Enter Rate of intrest: ");
		double rate = s.nextDouble();
		System.out.println("Enter time: ");
		double time = s.nextDouble();
		double amount= principal * Math.pow((1+rate/100.0),time);
		double ci=amount-principal;
		System.out.println("Amount:"+amount);
		System.out.println("compound intrest : "+ci);
		s.close();

	}

}
