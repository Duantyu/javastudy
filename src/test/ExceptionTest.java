package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String args[])
	{
		try {
			ExceptionTest();
		} catch (NumerRangeException e) {
			System.out.println(e.toString());
		} catch (InputMismatchException e)
		{
			System.out.println("����������");
		}
	}
	public static void ExceptionTest() throws NumerRangeException, InputMismatchException
	{
		Scanner reader = new Scanner(System.in);
		double a, b;
		System.out.println();
		a = reader.nextDouble();
		b = reader.nextDouble();
		if(a <= 0 || b <= 0)
		{
			throw new NumerRangeException("��һ����"+ a + "�ڶ�����" + b);
		}
		System.out.println();
	}

}
