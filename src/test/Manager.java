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
		jim.name = "Jim";  //Employee类继承了Person类的name属性
		jim.EmployeeNumber = 123456;  //Empolyee类本身拥有的属性
		System.out.println(jim.getName());
		Manager betty = new Manager();
		betty.name = "Betty";  //Manager类继承了Employee类的属性和方法
		betty.EmployeeNumber = 524341;
		betty.responsibilities = new Vector();  //动态的Vector类需要new创建对象
		betty.responsibilities.add("Internet project");  //Manager类自身的responsbilities属性
		System.out.println(betty.getName());  //继承了Person类的getName()方法
		System.out.println(betty.getEmployeeNumber());  //继承了Employee类的getEmployeeNumber()方法
  }
}



