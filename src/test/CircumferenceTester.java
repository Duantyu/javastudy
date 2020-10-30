package test;
public class CircumferenceTester {
	public static void main(String args[]) {
		CircleArea c1 = new CircleArea();
		c1.radius = 50;
		CircleArea c2 = new CircleArea();
		c2.radius = 10;
		double circum1 = c1.circumference();
		double circum2 = c2.circumference();
		System.out.println("Circle 1 has circumference " + circum1);
		System.out.println("Circle 2 has circumference " + circum2);
 }
}