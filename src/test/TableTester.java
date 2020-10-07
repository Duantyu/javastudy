package test;

public class TableTester {
	public static void main(String args[]) {
		int myTable[][] = {  //静态定义二维数组
				{23, 45, 65, 34, 21, 67, 78},
				{46, 14, 18, 46, 98, 63, 88},
				{98, 81, 64, 90, 21, 14, 23},
				{54, 43, 55, 76, 22, 43, 33}
		};
		int sum, max=0, maxRow = 0;
		for (int row = 0; row < 4; row ++) {  //遍历二维数组元素
			sum = 0;
			for (int col = 0; col < 7; col++) {
				System.out.print(myTable[row][col] + " ");				
				sum += myTable[row][col];   //按行求和
			}
			System.out.println();
			if (sum > max ) {
				max = sum;  
				maxRow = row;  //记录和最大的行的位置
			}
		}
		System.out.println("Row " + maxRow + " has the highest sum of " + max);
	}
}
