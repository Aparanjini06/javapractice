package com.codegnan.practice;

import java.util.Scanner;

public class VowelConStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] vowel= {'a','e','i','o','u','A','E','I','O','U'};
		String str1="";//vowel
		String str2="";//consonant
		for(int i=0;i<str.length();i++)
		{
			boolean isVowel=false;
			char ch=str.charAt(i);
			for(int j=0;j<vowel.length;j++)
			{
			
			if(ch==vowel[j]) {
				isVowel=true;
				break;
			}
			
			}
			if(isVowel)
			{
				str1+=ch;
			}
			else {
				str2+=ch;
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		sc.close();
	}

}
