package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonExample extends WindowAdapter
					implements ActionListener
					{
	JFrame f;
	JButton b;
	JTextField tf;
	int tag = 0;
	
	public static void main(String args[])
	{
		JButtonExample be = new JButtonExample();
		be.go();
	}
	
	public void go()
	{
		f = new JFrame("JButton Example");
		b = new JButton("Sample");
		b.addActionListener(this);
		f.getContentPane().add(b, "South");
		
		tf = new JTextField();
		f.getContentPane().add(tf, "Center");
		
		f.addWindowListener(this);
		f.setSize(300, 150);
		f.setVisible(true);
	}
	
	//实现 ActionListener 接口中的actionPerformed() 方法
	public void actionPerformed(ActionEvent e)
	{
		String s1 = "You hava pressed the Button!";
		String s2 = "You do another time! ";
		
		//交替显示两条信息
		if (tag == 0)
		{
			tf.setText(s1);
			tag = 1;
		}
		else
		{
			tf.setText(s2);
			tag = 0;
		}
	}
	//重写 WindowAdapter 类中的 windowClosing() 方法
	public void windowClosing(WindowEvent e)
	{
		//结束程序
		System.exit(0);
	}

}
