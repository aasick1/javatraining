package com.cloudfactory.oopconcept;

public class Student {
	
	private String name;
	private String lastName;
	
	public String getName() {
		return name;
	}
	
	public String getFullName() {
		return name + " "  + lastName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

}
