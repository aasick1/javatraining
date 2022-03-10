package com.cloudfactory.oopconcept;

public class D extends B{
	D(){
		System.out.println("I am in class D and extension of class B");
	}
	
	public static void main(String args[]) {
		D d = new D();
		//B b = new B();
		C c = new C();
	}

}
