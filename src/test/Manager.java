package test;

import java.util.*;

class Person {
	public String name;
	public String getName() {
		return name;
	}
}
class Employee extends Person {
	public int EmployeeNumber;
	public int getEmployeeNumber() {
		return EmployeeNumber;
		}
}

public class Manager extends Employee {
	public Vector responsibilities;
	public Vector getResponsibilities() {
		return responsibilities;
	}
	
	public static void main(String args[]) {
		Employee jim = new Employee();
		jim.name = "Jim";  //Employee��̳���Person���name����
		jim.EmployeeNumber = 123456;  //Empolyee�౾��ӵ�е�����
		System.out.println(jim.getName());
		Manager betty = new Manager();
		betty.name = "Betty";  //Manager��̳���Employee������Ժͷ���
		betty.EmployeeNumber = 524341;
		betty.responsibilities = new Vector();  //��̬��Vector����Ҫnew��������
		betty.responsibilities.add("Internet project");  //Manager�������responsbilities����
		System.out.println(betty.getName());  //�̳���Person���getName()����
		System.out.println(betty.getEmployeeNumber());  //�̳���Employee���getEmployeeNumber()����
  }
}



