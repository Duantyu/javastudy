package test;

public class Count {
	private int serialNumber;
	private static int counter = 0;  //��̬����counter�������
	public Count () {
		counter++;
	    serialNumber = counter;
	}
	public static void main(String args[]) {
		Count c1 = new Count(); //����ʵ������c1
		System.out.println(c1.serialNumber);
}
	}
