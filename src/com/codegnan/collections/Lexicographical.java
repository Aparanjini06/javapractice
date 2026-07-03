package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lexicographical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		while(sc.hasNext())
		{
			String str=sc.next();
			if(!str.matches("[a-zA-A]+"))
			{
				break;
			}
			arr.add(str);
		}
		Collections.sort(arr);
		for(String s:arr)
		{
			System.out.print(s+ " ");
		}
		sc.close();
	}
}
