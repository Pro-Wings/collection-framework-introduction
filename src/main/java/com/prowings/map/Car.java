package com.prowings.map;

public class Car implements Comparable<Car>{
	
	private int makeYear;
	private String companyName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int makeYear, String companyName) {
		super();
		this.makeYear = makeYear;
		this.companyName = companyName;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Car [makeYear=" + makeYear + ", companyName=" + companyName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + makeYear;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (makeYear != other.makeYear)
			return false;
		return true;
	}
	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize invoked on Car object : "+this);
		super.finalize();
	}
	@Override
	public int compareTo(Car o) {
		
		if(this.makeYear == o.makeYear)
			return 0;
		else if(this.makeYear > o.makeYear)
			return 2;
		else
			return -4;
	}
	
	
	
}
