package exercises;
import java.util.Scanner;
import java.lang.Math; 

public class TriangleArea {
	public static void main(String args[]) {
			double a,b,c,s,area;
			
			Scanner scan = new Scanner(System.in);
			a = scan.nextDouble();  //����߳�
			b = scan.nextDouble();
			c = scan.nextDouble();
			s = (a+b+c)/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));  //���ݱ߳������
			System.out.println("�߳�Ϊ"+ a+" " + b+" " + c +"�����ε������"+ area);
		}
	}

