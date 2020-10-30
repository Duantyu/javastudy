package test;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
	//容器
	private JFrame frame;
	//组件布局
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
		
		//添加按钮东部
		frame.getContentPane().add(be, BorderLayout.EAST);
		//添加按钮南部
		frame.getContentPane().add(bs, BorderLayout.SOUTH);
		//添加按钮西部
		frame.getContentPane().add(bw, BorderLayout.WEST);
		//添加按钮北部
		frame.getContentPane().add(bn, BorderLayout.NORTH);
		//添加按钮中部
		frame.getContentPane().add(bc, BorderLayout.CENTER);

		frame.setSize(350, 200);
		frame.setVisible(true);
	}
}
