package exercises;

abstract class Vehicle {
	char MovePlace;
	 void MoveStyle() {	 
	 }	
}
class RoadTransport extends Vehicle {
	char highway;
	void MoveStyle() {
		System.out.println("�����ƶ�����ǰ��");
	}
}
class train extends Vehicle {
	char rail;
	void MoveStyle() {
		System.out.println("����ǣ����������");
	} 
}
class airplan extends Vehicle {
	char sky;
	void MoveStyle() {
		System.out.println("�������䷴�ƻ������");
	}
}
