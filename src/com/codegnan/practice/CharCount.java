package com.codegnan.practice;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int count=0;
			if(str.indexOf(str.charAt(i))!=i)
			{
				continue;
			}
			for(int j=0;j<str.length();j++)
			{
				
				if(ch==str.charAt(j))
				{
					count++;
				}
				
			}
			System.out.println(ch+" count is "+count);
		}
		sc.close();
	}

}
