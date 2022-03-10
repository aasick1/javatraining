package com.feb25.questions;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Choose which course Details you want to see:");
		System.out.println("a: Part Time Course");
		System.out.println("b: On Site Course");
		
		
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();	
				
		switch(choice) {
		
		case ("a"):{
			PartTimeCourses ptc = new PartTimeCourses();
			ptc.getInfo();
			ptc.getTotalFee();
			break;
		}
		
		case "b":{
			OnSiteCourses osc = new OnSiteCourses();
			osc.getInfo();
			osc.getTotalFee();
			break;
		}
		
		default:
			System.out.println("Enter a or b");
		}
	
	}

}
