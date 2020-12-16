package test;

import java.util.Scanner;

public class Max_r_c {
	public static void main(String args[]) {
		int array[][] = new int [4][5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("---输入数组元素---");
		for (int i = 0; i < array.length; i++ ) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"列元素：");
				array[i][j] = input.nextInt();
			}
		}
		
		System.out.println("---数组最大值---");
		System.out.println("请等待...");
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
		
		System.out.println("---输出结果---");
		System.out.println("输出该数组");
		for(int a[]: array)
		{
			for(int i:a)
			{
			System.out.println(i+"\t");	
			}
			System.out.println();
		}
		System.out.println("该数组的最大值是："+max);
		System.out.println("该数组的最大值所在的行号是："+x);
		System.out.println("该数组的最大值所在的列号是："+y);
		
	}

}
