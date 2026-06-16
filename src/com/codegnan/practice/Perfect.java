
package com.codegnan.practice;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(num==sum)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+"is not a perfect number");
		}
		s.close();
	}

}
