package test;

import java.util.Scanner;

public class Max_r_c {
	public static void main(String args[]) {
		int array[][] = new int [4][5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("---��������Ԫ��---");
		for (int i = 0; i < array.length; i++ ) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				System.out.println("�������"+(i+1)+"�е�"+(j+1)+"��Ԫ�أ�");
				array[i][j] = input.nextInt();
			}
		}
		
		System.out.println("---�������ֵ---");
		System.out.println("��ȴ�...");
		int max = array[0][0];
		int x = 0, y = 0;
		for(int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if(array[i][j] > max)
				{
					max = array[i][j];
					x = i;
					y = j; 
				}
			}
		}
		
		System.out.println("---������---");
		System.out.println("���������");
		for(int a[]: array)
		{
			for(int i:a)
			{
			System.out.println(i+"\t");	
			}
			System.out.println();
		}
		System.out.println("����������ֵ�ǣ�"+max);
		System.out.println("����������ֵ���ڵ��к��ǣ�"+x);
		System.out.println("����������ֵ���ڵ��к��ǣ�"+y);
		
	}

}
