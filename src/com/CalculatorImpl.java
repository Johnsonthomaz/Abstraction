package com;

class CalculatorImpl implements Calculator
{
	@Override
	public void add(int x,int y) 
	{
		System.out.println("Sum of "+x+" & "+y+" is "+(x+y));
	}

	@Override
	public void mul(int x,int y) 
	{
		System.out.println("Product of "+x+" & "+y+" is "+(x*y));
	}

}
