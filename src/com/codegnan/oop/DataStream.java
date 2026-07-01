package com.codegnan.oop;



abstract class DataStream {
	public final boolean isValid(int num)
	{
		return num%2==0;
	}
	public abstract int apply(int value,int index);
}

final class Worker extends DataStream
{
	@Override
	public int apply(int value,int index)
	{
		if(isValid(value))
		{
			return value*index;
		}
		else {
			return value+index;
		}
	}
}
