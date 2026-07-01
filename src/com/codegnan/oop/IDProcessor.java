package com.codegnan.oop;

abstract class IDProcessor {
	public abstract int compute(int id);
}
final class FinalValidator extends IDProcessor{
	@Override
	public int compute(int id)
	{
		if(id%2==0)
		{
			return id/2;
		}
		else 
		{
			return id*3+1;
		}
	}
}
