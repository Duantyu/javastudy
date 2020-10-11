package test;
import java.lang.Math;

public class Point {
	//�������췽��
	double x, y;
	Point(double x1, double y1) {
		x=x1;
		y=y1;
	}
	public double distance() {
		return Math.sqrt( x*x + y*y );  //��άƽ�����ԭ�����ļ���
	}
	//�ȼ���public double distance(double x, double y) {	return Math.sqrt( x*x + y*y ); }
	
	//������Ա����
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
		SubClass son = new SubClass();   //����SubClass����ʵ������
		son.showMyPosition();		
	}
}
class Point3d extends Point {  //Point3d����Point�������
	Point3d(double x1, double y1, double z1) {  //����������Ϊָ���Ĺ��캯��,�͸����˱����Զ����ɵ�Ĭ���޲ι��캯��,����֮,����û���޲ι��캯��,��ô�ͳ����ˡ���������Ĺ��캯����ʲô������ʽ,����Ĭ�ϵ��ø����Ĭ�ϵ��޲εĹ��캯����
		super(x1, y1);
		// TODO Auto-generated constructor stub
	}
	public double distance(double x, double y, double z) {
		return Math.sqrt(x*x + y*y + z*z);
		}
	//public double distance() {  //��άƽ�����ԭ�����ļ���
		//return Math.sqrt(x*x + y*y + z*z);
	//}
	//�ȼ���public double distance(double x, double y, double z) { return Math.sqrt(x*x + y*y + z*z);}
	
	void print() {  //override��д��point����
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
		super.showMyPosition();  //��ʾ�����ø���ĺ���
		System.out.println("Now I have moved to subclass!");
	}
}
