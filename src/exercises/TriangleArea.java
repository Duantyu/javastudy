package exercises;
import java.util.Scanner;
import java.lang.Math; 

public class TriangleArea {
	public static void main(String args[]) {
			double a,b,c,s,area;
			
			Scanner scan = new Scanner(System.in);
			a = scan.nextDouble();  //输入边长
			b = scan.nextDouble();
			c = scan.nextDouble();
			s = (a+b+c)/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));  //根据边长求面积
			System.out.println("边长为"+ a+" " + b+" " + c +"三角形的面积："+ area);
		}
	}

