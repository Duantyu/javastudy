package OperateReport;

import java.util.Scanner;

public class CircleArea {
	//������Ķ���
	static double PI = 3.14159265;	
	public double circumference(double radius) {
		//�������ʹ��
		return 2* PI *radius;
	}
	public static void main(String args[])
	{
		double r;
		CircleArea c1 = new CircleArea();
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();
		System.out.println(c1.circumference(r));
		
	}
}
