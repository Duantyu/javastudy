package test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Date;

class myWriter extends Thread {
	//将数据输出
	private PipedOutputStream outStream;
    private String messages[] = {"Monday", "Tuesday", "Wensday", "Thursday","Friday", "Saturday", "Sunday"};
	public myWriter(PipedOutputStream o) {
		outStream = o;
	}
	
	public void run() {
		PrintStream p = new PrintStream(outStream);
		for (int i = 0; i < messages.length; i++)
		{
			p.println(messages[i]);
			
			
			p.flush();
			System.out.println("Write: " + messages[i]);
		}
		p.close();
		p = null;
	}
}

class myReader extends Thread {
	//从中读数据
	private PipedInputStream inStream;
	Date d = null;
	public myReader(PipedInputStream i) {
		inStream = i;
	}
	public void run() {
	String line;
		boolean reading = true;
		BufferedReader d = new BufferedReader (new InputStreamReader(inStream));
		while (reading && d != null) {
			try {
				line = d.readLine();
				if(line != null) System.out.println("Read: " + line);
				else reading = false;
			}catch(IOException e) {}
		}
		
		try {
			Thread.currentThread().sleep(4000);
		}catch(InterruptedException e ) {}
	}
}

public class Pipethread {
	public static void main(String args[]) {
		Pipethread thisPipe = new Pipethread();
		thisPipe.process();
	}
	public void process() {
		PipedInputStream inStream;
		PipedOutputStream outStream;
		try {
		outStream = new PipedOutputStream();
		inStream = new PipedInputStream(outStream);
		new myWriter(outStream).start();
		new myReader(inStream).start();
	 }catch (IOException e) { }
	}
}
