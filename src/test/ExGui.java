package test;

import java.awt.*;
import javax.swing.*;

public class ExGui {
	private JFrame frame;
	private JButton b1;
	private JButton b2;

	public static void main(String args[])
	{
		//创建一个 ExGui 实例
		ExGui that = new ExGui();
		that.go(); 
	}
	
	public void go()
	{
		//创建一个 JFrame 实例
		frame = new JFrame("GUI example");
		//获取窗格内容
		Container contentPane = frame.getContentPane();
		//为内容窗格设置 FlowLayout 布局管理器
		contentPane.setLayout(new FlowLayout());
		
		//创建 JButton 实例
		b1 = new JButton("Press me");
		b2 = new JButton("Don't press Me");
		
		//添加按钮
		contentPane.add(b1);
		
		contentPane.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	
	}
}