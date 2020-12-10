package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectRecov implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String arsg[]) {
		Student stu = null;
		try {
			FileInputStream fi = new FileInputStream("data.ser");
			ObjectInputStream si = new ObjectInputStream(fi);
			stu = (Student)si.readObject();
			si.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("ID: "+ stu.getId()+"name: "+stu.getName()+"birth: "+stu.getDate());
	}

}
