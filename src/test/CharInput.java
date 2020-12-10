package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharInput {
	public static void main(String args[]) throws IOException {
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);  //标准输入流串接到一个InputSreamReader上
		in = new BufferedReader(ir);  //串接到一个BufferedReader
		while ((s = in.readLine()) != null) {
			System.out.println("Read: " + s);
		}
		ir.close();
		in.close();
	}
}
