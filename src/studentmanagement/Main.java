package studentmanagement;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1 = new Teacher(1, "Teacher1", 500);
		Teacher teacher2 = new Teacher(2, "Teacher2", 700);
		Teacher teacher3 = new Teacher(3, "Teacher3", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		teacherList.add(teacher3);
		
		Student student1 = new Student(1, "Student1", 4);
		Student student2 = new Student(2, "Student2", 13);
		Student student3 = new Student(3, "Student3", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		School college1 = new School(teacherList, studentList);
		Teacher teacher4 = new Teacher(4, "Teacher4", 900);
		college1.addTeacher(teacher4);
		
		student1.payFees(5000);
		student2.payFees(6000);
		student3.payFees(4000);
		
		System.out.println("College 1 has earned " + college1.getTotalMoneyEarned());
		
		System.out.println("-----------Making School Pay Salary--------");
		teacher1.receiveSalary(teacher1.getSalary());
		System.out.println("College1 has spent for salary to " + teacher1.getName() + " and now has " 
		+ college1.getTotalMoneyEarned());

		teacher2.receiveSalary(teacher2.getSalary());
		System.out.println("College1 has spent for salary to " + teacher2.getName() + " and now has " 
		+ college1.getTotalMoneyEarned());
		
		teacher3.receiveSalary(teacher3.getSalary());
		System.out.println("College1 has spent for salary to " + teacher3.getName() + " and now has " 
		+ college1.getTotalMoneyEarned());
		
		System.out.println(student2);
		System.out.println(teacher3);
	}

}
