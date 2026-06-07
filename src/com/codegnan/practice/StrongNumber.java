package com.codegnan.git;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			
			num/=10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
		s.close();
	}

}
