package com.codegnan.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicatesArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		while(sc.hasNextInt())
		{
			list.add(sc.nextInt());
		}
		for(int num:list)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		for(int num:set)
		{
			System.out.print(num+" ");
		}
		sc.close();
	}

}
