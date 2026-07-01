package com.codegnan.oop;

import java.util.Scanner;

public class HopeFund {
	int totalDon;
	int donationType;
	String type;
	public static int matchedAmunt(int totalDon)
	{
		int doubleAmo=totalDon*2;
		if(doubleAmo>10000)
		{
			doubleAmo=10000;
		}
		return doubleAmo;
	}
	public int matchedDonor(int donationType,String type)
	{
		int tripleAmo=0;
		
		if(type.equalsIgnoreCase("individual"))
		{
			tripleAmo=donationType*3;
		}
		if(type.equalsIgnoreCase("corporate"))
		{
			tripleAmo=donationType*4;
		}
		if(tripleAmo>10000)
		{
			tripleAmo=10000;
		}
		return tripleAmo;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int totalDon=sc.nextInt();
		int donationType=sc.nextInt();
		String type=sc.next();
		System.out.println(HopeFund.matchedAmunt(totalDon));
		HopeFund h=new HopeFund();
		System.out.println(h.matchedDonor(donationType, type));
		sc.close();
	}
}
