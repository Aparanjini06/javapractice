package com.codegnan.practice;
import java.util.Scanner;

public class CelsiusToFarhenhiet {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the celsius value:");
		int celsius = s.nextInt();
		
		double farh = celsius* 9/5 +32;
		System.out.println("celsius : "+celsius);
		System.out.println("farhenheit : "+farh);
		s.close();
	}

}
