package test;
import java.lang.Math;

public class Point {
	//其他构造方法
	double x, y;
	Point(double x1, double y1) {
		x=x1;
		y=y1;
	}
	public double distance() {
		return Math.sqrt( x*x + y*y );  //二维平面点与原点距离的计算
	}
	//等价于public double distance(double x, double y) {	return Math.sqrt( x*x + y*y ); }
	
	//其他成员方法
	void print() {
		System.out.println("This is the superclass!");
	}
	 public static void main(String args[]) {
		Point superp = new Point(1, 1);
		superp.print();
		Point3d subp = new Point3d(1, 1, 1);
		subp.print();
		
		Point p = new Point(1, 1);
		System.out.println("p.distance() = " + p.distance());
		Point3d q = new Point3d(1,1,1);
		System.out.println("q.distance() = " + q.distance(1,1,1));
		SubClass son = new SubClass();   //创建SubClass子类实例对象
		son.showMyPosition();		
	}
}
class Point3d extends Point {  //Point3d类是Point类的子类
	Point3d(double x1, double y1, double z1) {  //父类有了人为指定的构造函数,就覆盖了本身自动生成的默认无参构造函数,换言之,父类没有无参构造函数,那么就出错了。不管子类的构造函数是什么样的形式,都会默认调用父类的默认的无参的构造函数。
		super(x1, y1);
		// TODO Auto-generated constructor stub
	}
	public double distance(double x, double y, double z) {
		return Math.sqrt(x*x + y*y + z*z);
		}
	//public double distance() {  //三维平面点与原点距离的计算
		//return Math.sqrt(x*x + y*y + z*z);
	//}
	//等价于public double distance(double x, double y, double z) { return Math.sqrt(x*x + y*y + z*z);}
	
	void print() {  //override重写了point方法
		System.out.println("This is the subclass!");
		super.print();
	}
}
class SuperClass {
	void showMyPosition() {
		System.out.println("I am in superclass!");
		System.out.println("I will go back now ...");
	}
}
class SubClass extends SuperClass{
	void showMyPosition() {
		System.out.println("At first I will go to superclass ...");
		super.showMyPosition();  //显示并调用父类的函数
		System.out.println("Now I have moved to subclass!");
	}
}
