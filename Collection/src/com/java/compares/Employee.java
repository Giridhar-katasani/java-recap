package com.java.compares;

public class Employee implements Comparable<Employee> {

	private String company;
	private float experience;
	private double salary;
	
	public Employee(String company, float experience, double salary) {
		super();
		this.company = company;
		this.experience = experience;
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary > o.salary ? 1 : (o.salary > this.salary ? -1 : 0);
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", experience=" + experience + ", salary=" + salary + "]";
	}
}
