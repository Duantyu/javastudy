package exercises;

abstract class Graphic {
	float width,length,r,hh;
	abstract void area();
}
class rectangular extends MyGraphic {
	int n=4;
	void area() {
		System.out.println("���ε�������ڳ��˿�");
	}
}
class triangle extends MyGraphic{
	int n=3;
	void area() {
		System.out.println("�����ε�������ڶ���֮һ�ױ߳˸�");
	}
}
class circle extends MyGraphic {
	float r;
	void area() {
		System.out.println("Բ��������ڦ��˰뾶��ƽ��");
	}
}
class ellipse extends MyGraphic {
	float a,b;
	void area() {
		System.out.println("��Բ��������ڦ������Ұ뾶�����°뾶֮��");
	}
}

class diamond extends MyGraphic {
	int n=4;
	float SideLength;
	void area() {
		System.out.println("���ε�������ڶ���֮һ�Խ���֮��");
}		
}
class trapezoidal extends MyGraphic {
	int n=4;
	float a,b,hh;
	void area() {
		System.out.println("���ε�������ڶ���֮һ�ϵ����µ�֮���ٳ˸�");
	}
}
public class MyGraphic{
public static void main(String args[]) {
	diamond d = new diamond();
	d.area();

}
}
