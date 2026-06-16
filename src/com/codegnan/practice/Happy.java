package com.codegnan.practice;
import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = num;
		while (num != 1 && num != 4) {
			int sum = 0;
			while (num != 0) {
				int lastDigit = num % 10;
				sum += lastDigit * lastDigit;
				num /= 10;

			}
			num = sum;

		}
		if (num == 1) {
			System.out.println(temp+ " is a happy number");
		} else {
			System.out.println(temp+ " is Not a happy number");
		}
		s.close();
	}

}
