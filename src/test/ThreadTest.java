package test;

//线程的运行具有随机性
class Lefthand extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("You are Students!");
			try {
				sleep(500);
			}catch (InterruptedException e) {}
		}
	}
}

class Righthand extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("I am a Teacher!");
			try {
				sleep(300);
			}catch (InterruptedException e) {}
		}
	}
}

public class ThreadTest {
	static Lefthand left;
	static Righthand right;
	public static void main (String[] args) {
		left = new Lefthand();
		right = new Righthand();
		left.start();
		right.start();
	}
}
