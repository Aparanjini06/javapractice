package com.codegnan.practice;

import java.util.Scanner;

public class DuplicateRemoveS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		//hello
		String str1="";
		
		for(int i=0;i<str.length();i++)//1
		{
			char ch=str.charAt(i);//h
			if(str1.indexOf(ch)==-1)//0==-1
			{
				str1+=ch;//h
			}
		}
		System.out.println(str1);
		s.close();
	}

}
