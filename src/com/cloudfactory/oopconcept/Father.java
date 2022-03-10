package com.cloudfactory.oopconcept;

public class Father extends GrandFather {
	//Fields
	String familyName;
	String houseAddress;
	
	//Constructor with no arguments
	Father(){
		familyName = "Maharjan";
		houseAddress = "Lalitpur";
		System.out.println("I am the Father class and inherited from GrandFather");
	}

}
