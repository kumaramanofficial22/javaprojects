package com.aman.beans;

import java.util.Date;
import java.util.Map;

public class FacultyInfo {
	
	private Map<String,String> facultySubjects;
	private Map<String, Date> dairy;
	
	
	public FacultyInfo(Map<String, String> facultySubjects, Map<String, Date> dairy) {
		super();
		this.facultySubjects = facultySubjects;
		this.dairy = dairy;
	}


	@Override
	public String toString() {
		return "FacultyInfo [facultySubjects=" + facultySubjects + ", dairy=" + dairy + "]";
	}
	
	
	
	

}
