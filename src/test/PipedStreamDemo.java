package test;
import java.io.*;

public class PipedStreamDemo {
	public static void main (String args[]) throws IOException {
		//�Կ��ܷ������쳣����ϵͳ����
		PipedOutputStream pos = new PipedOutputStream ();
		PipedInputStream pis = new PipedInputStream (pos);
		byte[] datamover = {0,2,3};  //datamoverָ���ַ�������һ��
		// byte datamover = 0; ����ͨ������
		// int datamover = 10; ����ͨ������
		//int[] datamover = {10,5,7}; �޷����� pos.write()
		System.out.println("\n Now I start to work.....\n");
		try {
			System.out.println("transfer " + datamover + " to ps. \n");
			pos.write(datamover);;
			System.out.println("pis get: " + (byte)pis.read());
		}
		finally {
			pis.close();
			pos.close();
		}
	}
}
