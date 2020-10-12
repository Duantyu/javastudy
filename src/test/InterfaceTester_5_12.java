package test;

//interface����ӿڣ�implementsʵ�ֽӿڣ�class name ���ؽӿ�ʵ�ֵľ����� ���ӿڶ�������ʡ��final,public,abstract�ؼ���

interface Shape2D {  //����Shape2D�ӿ�
	double pi = 3.14;  //���ݳ�Աһ��Ҫ��ʼ��
	double area();  //���󷽷�������Ҫ���崦��ʽ
}

class Circle implements Shape2D {  //����Circle��ʵ�ֽӿ�
	double radius;
	public Circle (double r) {  //���췽��
		radius = r;
	}
	public double area() {
		return (pi * radius * radius);
	}
}
class Retangle implements Shape2D {  //����Retangle��ʵ�ֽӿ�
	double width, height;
	public Retangle (double w, double h) {  //���췽��
		width = w;
		height = h;
	}
	public double area() {
		return (width * height);
	}
}

public class InterfaceTester_5_12 {
	public static void main(String args[]) {
		Retangle rect = new Retangle(5, 6);   //ʵ�ֽӿ�Retangle��ĵ���
		System.out.println("Area of rect = " + rect.area());
		Circle cir = new Circle(2.0);  //ʵ�ֽӿ�Circle��ĵ���
		System.out.println("Area of cir = " + cir.area());
		
		Shape2D var1, var2;  //�ӿ����͵ı���
		var1 = new Retangle(5, 6);
		System.out.println("Area of var1 = " + var1.area());  
		 													//�Ӿ�����������÷���
		var2 = new Circle(2.0);
		System.out.println("Area of = " + var2.area());
	} 
}