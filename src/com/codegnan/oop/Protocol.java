package com.codegnan.oop;

abstract class Protocol {
	public final int handle(int n)
	{
		if(n%2==0)
		{
			return -1;
					}
		return transform(n);
	}
	public abstract int transform(int n);
}
 class Sensor extends Protocol
{
	@Override
	public int transform(int n)
	{
		int sq=n*n;
		int sum=0;
		while(sq!=0)
		{
			int rem=sq%10;
			sum+=rem;
			sq=sq/10;
		}return sum;
	}
}
