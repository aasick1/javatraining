package com.feb25.questions;

public class PartTimeCourses extends Courses{
	private String courseTime;
	//double discount;
	
	PartTimeCourses(){
		this.courseName = "Java";
		this.duration = "40 hrs";
		this.courseFee = 2000;
		this.courseTime = "4 hrs";
		this.totalFee = courseFee - (courseFee/10) ;
	}
	
	void getInfo() {
		System.out.println("The details of Part Time Course: " + this.courseName);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Course Duration: " + this.duration);
		System.out.println("Course Fee: " + this.courseFee);
		System.out.println("Course Time: " + this.courseTime);
	}
	
	void getTotalFee() {
		System.out.println("The total fee for " + this.courseName + " with 10% discount is " + this.totalFee);
	}

}
