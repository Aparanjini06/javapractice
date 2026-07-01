package com.codegnan.oop;

import java.util.Scanner;

public class GadgetHub {
	public static double total(double[] prices)
	{
		double total=0;
		for(int i=0;i<prices.length;i++)
		{
			total+=prices[i];
		}
		if(total>10000)
		{
			total=10000;
			
		}
		return (int)total;
	}
	public double update(double[] prices, int index,String category)
	{
		if(category.equalsIgnoreCase("electronics"))
		{
			prices[index]=prices[index]*1.1;
		}
		if(category.equalsIgnoreCase("appliances"))
		{
			prices[index]=prices[index]*1.2;
		}
		if(prices[index]>10000)
		{
			prices[index]=10000;
		}
		return (int)prices[index];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] prices=new double[n];
		for(int i=0;i<n;i++)
		{
			 prices[i]=sc.nextInt();
		}
		int index=sc.nextInt();
		String type=sc.next();
		System.out.println(GadgetHub.total(prices));
		GadgetHub g=new GadgetHub();
		System.out.println(g.update(prices, index, type));
		sc.close();
	}
}
