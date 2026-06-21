package com.codegnan.practice;

import java.util.Scanner;

public class PrintDupStr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str1.indexOf(ch)==-1)
			{
				str1=str1+ch;
				
			}
			else {
				System.out.println(ch);
			}
		}
		s.close();
	}

}
