package com.cloudfactory.oopconcept;

public class BicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(20);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCadence(25);
		bike2.speedUp(25);
		bike2.changeGear(4);
		bike2.printStates();
	}

}
