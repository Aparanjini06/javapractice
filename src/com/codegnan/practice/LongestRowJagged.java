package com.codegnan.practice;

import java.util.Scanner;

public class LongestRowJagged {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int max = 0;
		int arr[][] = new int[r][];
		int longestRow = 0;
		for (int i = 0; i < r; i++) {
			int c = s.nextInt();
			if (c > max) {
				max = c;
				longestRow = i;
			}
			arr[i] = new int[c];
			for (int j = 0; j < c; j++) {
				arr[i][j] = s.nextInt();

			}
		}
		int sum = 0;

		for (int j = 0; j < arr[longestRow].length; j++) {

			sum += arr[longestRow][j];

		}

		System.out.println(sum);
		s.close();
	}

}
