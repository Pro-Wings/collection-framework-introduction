package com.prowings.treset;

import java.util.Comparator;

public class EmployeeAddressComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getAddress().compareTo(e2.getAddress());
		
	}

}
