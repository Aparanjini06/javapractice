package com.codegnan.oop;

import java.util.Scanner;

public class BrewCafe {

	int totalOrder;
	int orderAmount;
	public static int discountCal(int totalOrder)
	{
		double discount=0;
		discount=totalOrder*0.1;
		
		if(discount>100)
		{
			discount=100;
		}
		return (int)discount;
	}
	public int discountOrder(int orderAmount)
	{
		double discountS=0;
		if(orderAmount<50)
		{
			discountS=orderAmount*0.05;
		}
		else {
			discountS=orderAmount*0.15;
		}
		
		if(discountS>100)
		{
			discountS=100;
		}
		return (int)discountS;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalOrder=sc.nextInt();
		int orderAmount=sc.nextInt();
		System.out.print(BrewCafe.discountCal(totalOrder)+" ");
		BrewCafe b=new BrewCafe();
		
		System.out.print(b.discountOrder(orderAmount));
		sc.close();
	}

}
