package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharInput {
	public static void main(String args[]) throws IOException {
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);  //��׼���������ӵ�һ��InputSreamReader��
		in = new BufferedReader(ir);  //���ӵ�һ��BufferedReader
		while ((s = in.readLine()) != null) {
			System.out.println("Read: " + s);
		}
		ir.close();
		in.close();
	}
}
