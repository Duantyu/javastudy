package test;

import java.util.*;

public class MyVector extends Vector {  //定义MyVector继承自父类Vector
	public MyVector() {
		super(1, 1);  //指定capacity和capacityIncrement 取值
	}
	public void addInt (int i) {
		addElement(new Integer(i));  //添加int类型的元素
	}
	public void addFloat(float f) {
		addElement(new Float(f));  //添加float类型的元素
	}
	public void addString(String s) {
		addElement(s);  //添加string类型的元素
	}
	public void addCharArray(char a[]) {
		addElement(a);  //添加char类型的元素
	}
	public void printVector() {  //
		Object o;  //Object 通用类型
		int length = size();  //同capacity相比较
		
		System.out.println("Number of vector elements is " + length + " and they are : ");
		for (int i = 0; i < length; i++) {  //遍历打印元素
			o = elementAt(i);
			if (o instanceof char[]) {  //instanceof运算符判断o的类型
				System.out.println(String.copyValueOf((char[]) o));
			}
			else 
				System.out.println(o.toString());		
		}
	}
	
	public static void main (String args[]) {
		MyVector v = new MyVector();  //创建MyVector实例对象
		int digit = 5;
		float real = 3.14f;
		char letters[] = {'a', 'b', 'c', 'd'};
		String s = new String("Hi there!");
		
		v.addInt(digit);
		v.addFloat(real);
		v.addCharArray(letters);
		v.addString(s);
		
		v.printVector();
	}
}
