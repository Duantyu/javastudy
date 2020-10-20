package test;

public class UseGeneral {
	public static void main(String args[]) {
		int a = 9;
		int b = 10;
		//类方法的使用
		int c = GeneralFunction.addUp(a, b);  
		System.out.println("addUp() gives " + c);
	}
}
