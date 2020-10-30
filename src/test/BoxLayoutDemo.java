package test;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv, ph;
	
	public static void main(String args[])
	{
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();
	}
	
	void go()
	{
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		
		pv = new JPanel();
		//��pv�Ĳ��ֹ���������Ϊ��ֱ�����BoxLayout
		pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
		//����ʹ�ô�ֱ BoxLayout �� Box ʵ��
		//bv = Box.createVerticalBox()
		
		//Ϊpv��ӱ�ǩlabel
		pv.add(new JLabel(" Monday"));
		pv.add(new JLabel(" Tuesday"));
		pv.add(new JLabel(" Wednesday"));
		pv.add(new JLabel(" Thursday"));
		pv.add(new JLabel(" Friday"));
		pv.add(new JLabel(" Saturday"));
		pv.add(new JLabel(" Sunday"));
		
		//��pv��ӵ����ݴ�����в�
		contentPane.add(pv, BorderLayout.CENTER);
		
		ph = new JPanel();
		//��ph�Ĳ��ֹ���������Ϊˮƽ�����BoxLayout
		ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
		//����ʹ��ˮƽ���� BoxLayout ��Boxʵ��
		//bh = Box.createHorizontalBox();
		
		//Ϊph��Ӱ�ť
		ph.add(new JButton("Yes"));
		ph.add(new JButton("No"));
		ph.add(new JButton("Cancel"));
		
		//��ph��ӵ����ݴ�����ϲ�
		contentPane.add(ph, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
