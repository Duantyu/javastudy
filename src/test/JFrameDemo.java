package test;
//JFrame��һ�����б����кͿ��ư�ť�Ķ�������

import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String s[]) {
		//����һ��JFrame��ʵ��
		JFrame frame = new JFrame ("JFrameDemo");
		//����һ��JButton��ʵ��
		JButton button = new JButton("Press me");
		
		//�� JBbutton �ŵ� JFrame ������
		frame.getContentPane().add(button, BorderLayout.CENTER);
		
		//�� JFrame ���õ��ʵ��Ĵ�С
		frame.pack();
		//��ʾ JFrame
		frame.setVisible(true);
	}

}
