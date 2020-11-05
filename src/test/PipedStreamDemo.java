package test;
import java.io.*;

public class PipedStreamDemo {
	public static void main (String args[]) throws IOException {
		//对可能发生的异常交由系统处理
		PipedOutputStream pos = new PipedOutputStream ();
		PipedInputStream pis = new PipedInputStream (pos);
		byte[] datamover = {0,2,3};  //datamover指向地址，输出第一个
		// byte datamover = 0; 正常通过编译
		// int datamover = 10; 正常通过编译
		//int[] datamover = {10,5,7}; 无法正常 pos.write()
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
