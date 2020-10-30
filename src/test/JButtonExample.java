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
	
	//ʵ�� ActionListener �ӿ��е�actionPerformed() ����
	public void actionPerformed(ActionEvent e)
	{
		String s1 = "You hava pressed the Button!";
		String s2 = "You do another time! ";
		
		//������ʾ������Ϣ
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
	//��д WindowAdapter ���е� windowClosing() ����
	public void windowClosing(WindowEvent e)
	{
		//��������
		System.exit(0);
	}

}
