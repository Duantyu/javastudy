package exercises;

abstract class Graphic {
	float width,length,r,hh;
	abstract void area();
}
class rectangular extends MyGraphic {
	int n=4;
	void area() {
		System.out.println("矩形的面积等于长乘宽");
	}
}
class triangle extends MyGraphic{
	int n=3;
	void area() {
		System.out.println("三角形的面积等于二分之一底边乘高");
	}
}
class circle extends MyGraphic {
	float r;
	void area() {
		System.out.println("圆的面积等于Π乘半径的平方");
	}
}
class ellipse extends MyGraphic {
	float a,b;
	void area() {
		System.out.println("椭圆的面积等于Π乘左右半径与上下半径之积");
	}
}

class diamond extends MyGraphic {
	int n=4;
	float SideLength;
	void area() {
		System.out.println("菱形的面积等于二分之一对角线之积");
}		
}
class trapezoidal extends MyGraphic {
	int n=4;
	float a,b,hh;
	void area() {
		System.out.println("梯形的面积等于二分之一上底与下底之和再乘高");
	}
}
public class MyGraphic{
public static void main(String args[]) {
	diamond d = new diamond();
	d.area();

}
}
