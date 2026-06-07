package com.codegnan.git;

import java.util.Scanner;

public class AscDesArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int []a=new int[row];
		for(int i=0;i<row;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row-1;j++) {
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<row;i++) {
			System.out.println(a[i]);
		}
		s.close();
	}

}
