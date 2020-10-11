package test;

import java.util.*;

public class MyVector extends Vector {  //����MyVector�̳��Ը���Vector
	public MyVector() {
		super(1, 1);  //ָ��capacity��capacityIncrement ȡֵ
	}
	public void addInt (int i) {
		addElement(new Integer(i));  //���int���͵�Ԫ��
	}
	public void addFloat(float f) {
		addElement(new Float(f));  //���float���͵�Ԫ��
	}
	public void addString(String s) {
		addElement(s);  //���string���͵�Ԫ��
	}
	public void addCharArray(char a[]) {
		addElement(a);  //���char���͵�Ԫ��
	}
	public void printVector() {  //
		Object o;  //Object ͨ������
		int length = size();  //ͬcapacity��Ƚ�
		
		System.out.println("Number of vector elements is " + length + " and they are : ");
		for (int i = 0; i < length; i++) {  //������ӡԪ��
			o = elementAt(i);
			if (o instanceof char[]) {  //instanceof������ж�o������
				System.out.println(String.copyValueOf((char[]) o));
			}
			else 
				System.out.println(o.toString());		
		}
	}
	
	public static void main (String args[]) {
		MyVector v = new MyVector();  //����MyVectorʵ������
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
