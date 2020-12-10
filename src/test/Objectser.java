package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objectser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Student stu = new Student(9810136, "Li Ming", 16, "CSD");
		try {
			FileOutputStream fo = new FileOutputStream("data.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo); 
			so.writeObject(stu);
			so.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
