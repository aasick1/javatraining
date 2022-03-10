package com.cloudfactory.oopconcept;

public abstract class MyAbstractProcess {
	public void process() {
		stepBefore();
		action();
		stepAfter();
	}

	private void stepAfter() {
		// TODO Auto-generated method stub
		System.out.println("This is the afterstep");
	}

	protected abstract void action();

	private void stepBefore() {
		// TODO Auto-generated method stub
		System.out.println("This is the beforestep");
		
	}
	
	

}
