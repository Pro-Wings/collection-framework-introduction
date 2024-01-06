package com.prowings.enumsdemo;

public strictfp enum Size {
	SMALL(28), MEDIUM(32), LARGE(42), EXTRALARGE(44);
	
	int size;
	
	Size(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public double calculatePrize()
	{
		return this.getSize() * 20;
	}
}
