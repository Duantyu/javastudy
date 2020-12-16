package test;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		try {
			File file = new File("file.txt");
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream(FileDescriptor.out);
			int data;
			while(in.available()>0)
			{
				data = in.read();
				out.write(data);
			}
			out = new FileOutputStream(file,true);
			String str= "又添加了一行文字！";
			byte array[] = str.getBytes();
			out.write(array);
			out.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
