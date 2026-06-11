package com.codegnan.practice;
import java.util.Scanner;

public class SecondLargestSmall {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int []a=new int[row];
		for(int i=0;i<row;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int secSmall=0,secLargest=0;
		for(int i=0;i<row;i++)
		{
			 secSmall=a[1];
			 secLargest=a[row-2];
			//System.out.println("second smallest element:"+a[i+1]);
			//System.out.println("second largest element:"+a[row-1]);
		}
		System.out.println(secSmall);
		System.out.println(secLargest);
		s.close();
	}

}
