package com.codegnan.oop;

import java.util.Scanner;

public class IDProcessorMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FinalValidator f=new FinalValidator();
		System.out.println(f.compute(n));
		sc.close();
	}
}
