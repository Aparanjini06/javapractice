package com.codegnan.practice;
import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int num=s.nextInt();
		int temp=num;
		
		while(num!=0)
		{
			int fact=1;
			int lastDigit=num%10;
			for(int i=1;i<=lastDigit;i++)
			{
				fact*=i;
			}
			sum+=fact;
			
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is a strong number");
		}
		else {
			System.out.println(temp+" is not a strong number");
		}
		s.close();
	}

}
