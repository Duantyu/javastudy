package test;

//interface定义接口，implements实现接口，class name 承载接口实现的具体类 ，接口定义允许省略final,public,abstract关键字

interface Shape2D {  //定义Shape2D接口
	double pi = 3.14;  //数据成员一定要初始化
	double area();  //抽象方法，不需要定义处理方式
}

class Circle implements Shape2D {  //具体Circle类实现接口
	double radius;
	public Circle (double r) {  //构造方法
		radius = r;
	}
	public double area() {
		return (pi * radius * radius);
	}
}
class Retangle implements Shape2D {  //具体Retangle类实现接口
	double width, height;
	public Retangle (double w, double h) {  //构造方法
		width = w;
		height = h;
	}
	public double area() {
		return (width * height);
	}
}

public class InterfaceTester_5_12 {
	public static void main(String args[]) {
		Retangle rect = new Retangle(5, 6);   //实现接口Retangle类的调用
		System.out.println("Area of rect = " + rect.area());
		Circle cir = new Circle(2.0);  //实现接口Circle类的调用
		System.out.println("Area of cir = " + cir.area());
		
		Shape2D var1, var2;  //接口类型的变量
		var1 = new Retangle(5, 6);
		System.out.println("Area of var1 = " + var1.area());  
		 													//视具体的类来调用方法
		var2 = new Circle(2.0);
		System.out.println("Area of = " + var2.area());
	} 
}