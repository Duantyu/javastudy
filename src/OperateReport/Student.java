package OperateReport;

import java.io.Serializable;

public class Student implements Serializable {
	private  int id;
	private String name;
	private int age;
	private String department;
	public Student(int id, String name, int age, String department)
	{
		this.id = id;
		this.age = age;
		this.department = department;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
