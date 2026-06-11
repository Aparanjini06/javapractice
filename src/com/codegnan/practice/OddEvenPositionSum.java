package com.codegnan.practice;//odd and even positions sum
import java.util.Scanner;

public class OddEvenPositionSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int num=s.nextInt();
		int []a=new int[num];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<a.length;i++)
		{	
			if(i%2==0)
			{
				oddSum+=a[i];
			}
			else {
				evenSum+=a[i];
			}
			
			
		}
		System.out.println("The sum of even positions:"+evenSum);
		System.out.println("The sum of odd positions:"+oddSum);
		s.close();
	}

}


