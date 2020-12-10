package test;

class Matrix {
	int n, m, s,i,j,count=0;
	int Matrix1[][] = new int [m][n];
	
	int Matrix2[][] = new int [n][s];
	
	int Matrix3[][] = new int [m][s]; 
	
	int sum[] = new int[m*s];
}
	
class hand extends  Thread {
	Matrix matrix = new Matrix();
	public void run()	{
		for (int i=0; i < matrix.s; i++) { 
			for (int j=0; j < matrix.m; j++) {
			matrix.sum[matrix.m*matrix.s] = matrix.count + matrix.Matrix1[i][j] * matrix.Matrix2[j][i];
		}
	}		
}
}

public class MatrixMultiplication {

}
