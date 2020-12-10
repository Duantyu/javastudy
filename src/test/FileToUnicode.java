package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileToUnicode {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\myFile.txt");
			InputStreamReader dis = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(dis);  // ReaderÓëWriterµÄI/OÁ÷
			String s;
			while((s = reader.readLine()) != null) {
				System.out.println("read: " + s);
			}
			dis.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
