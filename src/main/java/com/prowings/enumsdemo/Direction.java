package com.prowings.enumsdemo;

//Note : we can not extends anything into an enum - as it is already child of java.lang.Enum class. So we can just inherit another Interface in it.
public enum Direction implements I{
	
	SOUTH,NORTH,EAST,WEST;

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

}
