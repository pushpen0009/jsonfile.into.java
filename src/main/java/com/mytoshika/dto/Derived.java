package com.mytoshika.dto;

public class Derived {

	private boolean isOldEmployee;
	
	private boolean isGoodSalary;

	public boolean isOldEmployee() {
		return isOldEmployee;
	}

	public void setOldEmployee(boolean isOldEmployee) {
		this.isOldEmployee = isOldEmployee;
	}

	public boolean isGoodSalary() {
		return isGoodSalary;
	}

	public void setGoodSalary(boolean isGoodSalary) {
		this.isGoodSalary = isGoodSalary;
	}

	@Override
	public String toString() {
		return "Derived [isOldEmployee=" + isOldEmployee + ", isGoodSalary=" + isGoodSalary + "]";
	}

}
