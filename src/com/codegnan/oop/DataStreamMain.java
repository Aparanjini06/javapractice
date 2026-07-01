package com.codegnan.oop;

import java.util.Scanner;

public class DataStreamMain {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				int value=sc.nextInt();
				Worker w=new Worker();
				System.out.println(w.apply(value, i));
			}
			sc.close();
		}
	
}
