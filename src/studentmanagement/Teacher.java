/**
 * This class is responsible for keeping the track of the teacher's name, id & salary
 */
package studentmanagement;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a new Teacher Object
	 * @param id id for the teachers id
	 * @param name name of the teacher
	 * @param salary salary of the teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * @return the id of the teacher
	 */
	public int getId() {
		return id;
	}
	/** 
	 * @return name of the teacher
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the salary of the teacher
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * set the salary
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salary earned
	 * Renives frint eg titak nibet earned by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Name of the Teacher: " +name + " Total Salary earned: " +salaryEarned;
	}
	

}
