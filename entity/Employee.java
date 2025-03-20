package com.entity;

public class Employee {
	private int emp_id;
	private String name;
	private String salary;
	private Country con;

	public Employee() {

	}

	public Employee(int emp_id, String name, String salary, Country con) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.con = con;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + ", con=" + con + "]";
	}

}
