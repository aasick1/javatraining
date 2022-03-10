package com.feb25.questions;

public class OnSiteCourses extends Courses{
	private String companyName;
	private int numOfCandidates;
	//private double charge;
	
	OnSiteCourses(){
		this.courseName = "ASP.NET";
		this.duration = "80 hrs";
		this.courseFee = 3000;
		companyName = "Cloudfactory";
		numOfCandidates = 80;
		this.totalFee = courseFee + courseFee/10;
	}
	
	void getInfo() {
		System.out.println("The details of On Site Course: " + this.courseName);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Course Duration: " + this.duration);
		System.out.println("Course Fee: " + this.courseFee);
		System.out.println("Company Name: " + this.companyName);
		System.out.println("Number of candidates: " + this.numOfCandidates);
	}
	
	void getTotalFee() {
		System.out.println("The total fee for " + this.courseName + " with 10% charge is " + this.totalFee);
	}

}
