package test;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Frame with Panel");
		Container contentPane = frame.getContentPane();
		//�� JFrame ʵ���ı�������Ϊ����ɫ
		contentPane.setBackground(Color.CYAN);
		//����һ�� JPanel ��ʵ��
		JPanel panel = new JPanel();
		//�� JPanel ʵ���ı�������Ϊ��ɫ
		panel.setBackground(Color.yellow);
		
		JButton button = new JButton("Press me");
		//�� JButton ʵ����ӵ� JPanel ��
		panel.add(button);
		
		//�� JPanel ʵ����ӵ� JFrame ���ϲ�
		contentPane.add(panel, BorderLayout.SOUTH);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
