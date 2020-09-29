package exercises;

abstract class Vehicle {
	char MovePlace;
	 void MoveStyle() {	 
	 }	
}
class RoadTransport extends Vehicle {
	char highway;
	void MoveStyle() {
		System.out.println("动力推动车轮前进");
	}
}
class train extends Vehicle {
	char rail;
	void MoveStyle() {
		System.out.println("动力牵引火车轮运行");
	} 
}
class airplan extends Vehicle {
	char sky;
	void MoveStyle() {
		System.out.println("动力喷射反推机身飞行");
	}
}
