package com.codegnan.oop;

import java.util.Scanner;

public class ProtocolMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sensor p=new Sensor();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			
			System.out.println(p.handle(num));
		}
		
		sc.close();
	}

}
