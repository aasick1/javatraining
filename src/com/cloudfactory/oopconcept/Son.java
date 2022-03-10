package com.cloudfactory.oopconcept;

public class Son extends Father{
	String name;
	Son(){
		name = "Aashik";
	}
	
	void printDetails() {
		System.out.println("Hello, my name is " + this.name + 
				" " + this.familyName + ". I am from " + this.houseAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		s1.printDetails();

	}

}
