package com.prowings.map;

import java.util.Comparator;

public class CarCompanyMakeYearComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		
		if(c1.getMakeYear() == c2.getMakeYear())
			return 0;
		else if(c1.getMakeYear() > c2.getMakeYear())
			return 4;
		else
			return -4;
	}

}
