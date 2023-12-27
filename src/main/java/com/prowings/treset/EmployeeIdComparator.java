package com.prowings.treset;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getId() == e2.getId())
			return 0;
		else if(e1.getId() > e2.getId())
			return 2;
		else
			return -3;
	}

}
