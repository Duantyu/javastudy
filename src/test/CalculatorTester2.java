package test;

import java.util.Scanner;

class Calculator {
	public static double calculateAverage (int[] numbers) {  //��ͨ����������Ϊһ������������ƽ��ֵ
		int sum = 0;
		for (int i =0; i < numbers.length; i++)  //�������������ÿ��Ԫ��
			sum += numbers[i];
		return sum / (double) numbers.length;   //ǿ��ת��Ϊdouble
	}
	public static int findMaximum(int[] numbers) {  //��ͨ����������Ϊһ���������������ֵ
		int max = numbers[0]; 
		for (int i = 0; i < numbers.length; i++)
			if(numbers[i] > max)
				max = numbers[i];
		return max;
	}
}
public class CalculatorTester2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numbers[] = {23, 54, 88, 98, 23, 54, 7, 72, 35, 22};
		System.out.println("The average is " + Calculator.calculateAverage(numbers));  //����Calculator���е�calculateAverage����
		System.out.println("The maximum is " + Calculator.findMaximum(numbers));  //����Calculator���е�findMaximum����
		
	}
}
