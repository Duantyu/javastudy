package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JButtonExample2 extends WindowAdapter implements ActionListener
{
	JFrame f;
	JPanel p;
	JButton b1,b2;
	JTextField tf;
	int tag = 0;
	
	public static void main(String args[])
	{
		JButtonExample2 be = new JButtonExample2();
		be.go();
	}
	
	public void go()
	{
		f = new JFrame("JButton Example2");
		
		b1 = new JButton("Sample");
		//���ÿ�ݼ�
		b1.setMnemonic(KeyEvent.VK_S);
		b1.setActionCommand("Sample");
		b1.addActionListener(this);
		
		b2 = new JButton("Disable Sample");
		//���ÿ�ݼ�
		b2.setMnemonic(KeyEvent.VK_A);
		b2.setActionCommand("disable");
		b2.addActionListener(this);
		
		p =new JPanel();
		p.add(b1);
		p.add(b2);
		
		f.getContentPane().add(p,"South");
		
		tf = new JTextField();
		f.getContentPane().add(tf,"Center");
		
		f.addWindowListener(this);
		f.setSize(300,150);
		f.setVisible(true);
	}
	
	//ʵ��ActionListener�ӿ��е�actionPerformed() ����
	public void actionPerformed(ActionEvent e)
	{
		String s1 = "You have pressed the Button!";
		String s2 = "You doo another time!";
		
		//���������������ж�
		if(e.getActionCommand()== "Sample")
		{
			if(tag == 0)
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
		if (e.getActionCommand() == "disable")
		{
			//����Sample ��ťΪ������
			b1.setEnabled(false);
			//�޸���ʾ�ı�
			b2.setText("Enable Sample");
			//�޸�����
			b2.setActionCommand("enable");
		}
		if (e.getActionCommand() == "enable")
		{
			//����Sample��ťΪ����
			b1.setEnabled(true);
			b2.setText("Disable Sample");
			b2.setActionCommand("disable");
		}
	}
	
	//����WindowApdapter ���е�windowClosing()����
	public void windowClosing(WindowEvent e)
	{
		//��������
		System.exit(0);
	}
}
