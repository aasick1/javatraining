package com.cloudfactory.oopconcept;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setName("Aashik");
		System.out.println(s1.getName());
		
		Student s2 = new Student();
		s2.setName("Raja", "Baucha");
		System.out.println(s2.getFullName());

	}

}
