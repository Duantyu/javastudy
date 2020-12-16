package test;

public class Deposit {
	public static void main(String[] args) {
		Customer one = new Customer("one");
		Customer two = new Customer("two");
		
		one.start();
		two.start();
	}
}
