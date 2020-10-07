package test;

import java.util.Scanner;

class Calculator {
	public static double calculateAverage (int[] numbers) {  //普通方法，参数为一组整型数，求平均值
		int sum = 0;
		for (int i =0; i < numbers.length; i++)  //遍历整型数组的每个元素
			sum += numbers[i];
		return sum / (double) numbers.length;   //强制转换为double
	}
	public static int findMaximum(int[] numbers) {  //普通方法，参数为一组整型数，求最大值
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
		System.out.println("The average is " + Calculator.calculateAverage(numbers));  //调用Calculator类中的calculateAverage方法
		System.out.println("The maximum is " + Calculator.findMaximum(numbers));  //调用Calculator类中的findMaximum方法
		
	}
}
