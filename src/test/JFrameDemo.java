package test;
//JFrame是一个带有标题行和控制按钮的独立窗口

import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String s[]) {
		//创建一个JFrame的实例
		JFrame frame = new JFrame ("JFrameDemo");
		//创建一个JButton的实例
		JButton button = new JButton("Press me");
		
		//将 JBbutton 放到 JFrame 的中央
		frame.getContentPane().add(button, BorderLayout.CENTER);
		
		//将 JFrame 设置到适当的大小
		frame.pack();
		//显示 JFrame
		frame.setVisible(true);
	}

}
