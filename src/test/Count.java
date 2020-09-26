package test;

public class Count {
	private int serialNumber;
	private static int counter = 0;  //静态变量counter负责计数
	public Count () {
		counter++;
	    serialNumber = counter;
	}
	public static void main(String args[]) {
		Count c1 = new Count(); //创建实例对象c1
		System.out.println(c1.serialNumber);
}
	}
