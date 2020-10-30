package test;

import java.awt.*;
import javax.swing.*;

public class ExGui {
	private JFrame frame;
	private JButton b1;
	private JButton b2;

	public static void main(String args[])
	{
		//����һ�� ExGui ʵ��
		ExGui that = new ExGui();
		that.go(); 
	}
	
	public void go()
	{
		//����һ�� JFrame ʵ��
		frame = new JFrame("GUI example");
		//��ȡ��������
		Container contentPane = frame.getContentPane();
		//Ϊ���ݴ������� FlowLayout ���ֹ�����
		contentPane.setLayout(new FlowLayout());
		
		//���� JButton ʵ��
		b1 = new JButton("Press me");
		b2 = new JButton("Don't press Me");
		
		//��Ӱ�ť
		contentPane.add(b1);
		
		contentPane.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	
	}
}