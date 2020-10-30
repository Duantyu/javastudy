package test;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Frame with Panel");
		Container contentPane = frame.getContentPane();
		//将 JFrame 实例的背景设置为蓝绿色
		contentPane.setBackground(Color.CYAN);
		//创建一个 JPanel 的实例
		JPanel panel = new JPanel();
		//将 JPanel 实例的背景设置为黄色
		panel.setBackground(Color.yellow);
		
		JButton button = new JButton("Press me");
		//将 JButton 实例添加到 JPanel 中
		panel.add(button);
		
		//将 JPanel 实例添加到 JFrame 的南侧
		contentPane.add(panel, BorderLayout.SOUTH);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
