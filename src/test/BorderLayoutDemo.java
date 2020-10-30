package test;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
	//����
	private JFrame frame;
	//�������
	private JButton be, bw, bn, bs, bc;
	
	public static void main(String args[]) 
	{
		BorderLayoutDemo that = new BorderLayoutDemo();
		that.go();
	}
	
	void go()
	{
		frame = new JFrame("Border Layout");
		be = new JButton("East");
		bs = new JButton("South");
		bw = new JButton("West");
		bn = new JButton("North");
		bc = new JButton("Center");
		
		//��Ӱ�ť����
		frame.getContentPane().add(be, BorderLayout.EAST);
		//��Ӱ�ť�ϲ�
		frame.getContentPane().add(bs, BorderLayout.SOUTH);
		//��Ӱ�ť����
		frame.getContentPane().add(bw, BorderLayout.WEST);
		//��Ӱ�ť����
		frame.getContentPane().add(bn, BorderLayout.NORTH);
		//��Ӱ�ť�в�
		frame.getContentPane().add(bc, BorderLayout.CENTER);

		frame.setSize(350, 200);
		frame.setVisible(true);
	}
}
