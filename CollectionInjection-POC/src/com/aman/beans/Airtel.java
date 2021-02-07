package com.aman.beans;

import java.util.Date;
import java.util.Set;

public class Airtel {
	
	private Set<Long> availableNumbers;
	private Set<Date> setDates;
	
	
	public void setAvailableNumbers(Set<Long> availableNumbers) {
		this.availableNumbers = availableNumbers;
	}
	public void setSetDates(Set<Date> setDates) {
		this.setDates = setDates;
	}
	
	
	@Override
	public String toString() {
		return "Airtel [availabaleNumbers=" + availableNumbers + ", dates=" + setDates + "]";
	}
	
	

}
