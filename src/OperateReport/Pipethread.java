package OperateReport;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class myWriter extends Thread {
	private PipedOutputStream outStream;
	//从序列化对象流中读数据然后out到线程流中。
	public myWriter(PipedOutputStream o)
	{
		outStream=o;
	}
	public void run() {
	ObjectOutputStream p = null;
	try {
		p = new ObjectOutputStream(outStream);
	}catch(IOException e) {
		e.printStackTrace();
	}
	for (int i =0 ; i <5; i++) {
		Student s = new Student(i,"kk"+i,(int) (Math.random()*30),"CSD");
		try {
			//把对象塞进管道中。对象封包
			p.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p = null;
	}
 }
}

class myReader extends Thread {
	private PipedInputStream inStream;
	public myReader(PipedInputStream i)
	{
		inStream=i;
	}
	public void run() {
		ObjectInputStream q = null;
		try {
			q = new ObjectInputStream(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean reading = true;
		while(reading) {
			Student s = null;
			try {
				 	Object o = q.readObject();
				 	if (o==null)
				 		break;
				 	s = (Student)o;  //对象拆包过程 
			}catch(ClassNotFoundException | IOException e) {
				e.printStackTrace();
				reading = false;
			}
			System.out.println("Read: "  + s);
		}
		
	}
}

public class Pipethread {
	public static void main(String args[]) {
		Pipethread thisPipe = new Pipethread();
		thisPipe.process();
	}
	public void process() {
		PipedInputStream inStream;
		PipedOutputStream outStream = null;
		try {
			//管道的创建pip
		inStream = new PipedInputStream(outStream);
		new myWriter(outStream).start();
		new myReader(inStream).start();
		
	 }catch (IOException e) { 
		 e.printStackTrace();
	 }
	}
}

