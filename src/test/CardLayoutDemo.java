package test;

//JFrame 实例的内容窗格指定了一个CardLayout类型的布局管理器，然后向其中加入了5张卡片，每张卡片都是JPanel类的一个实例，并且具有不同的背景颜色。每当程序窗口按动鼠标，下一张卡片就会显示出来。
import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

public class CardLayoutDemo extends MouseAdapter
{
	JPanel p1, p2, p3, p4, p5;
	JLabel l1, l2, l3, l4, l5;
	
	//声明一个 CardLayout 对象
	CardLayout myCard;
	JFrame frame;
	Container contentPane;
	
	public static void main(String args[])
	{
		CardLayoutDemo that = new CardLayoutDemo();
		that.go();
	}
	
	public void go() 
	{
		frame = new JFrame ("Card Test");
		contentPane = frame.getContentPane();
		myCard = new CardLayout();
		
		//设置 CardLayout 布局管理器
		contentPane.setLayout(myCard);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
	
		//为每个JPanel 创建一个标签并设定不同的背景颜色，以便于区分
		l1 = new JLabel("This is the first JPanel");
		p1.add(l1);
		p1.setBackground(Color.yellow);
		
		l2 = new JLabel("This is the second JPanel");
		p2.add(l2);
		p2.setBackground(Color.green);
		
		l3 = new JLabel("This is the third JPanel");
		p3.add(l3);
		p3.setBackground(Color.magenta);
		
		l4 = new JLabel("This is the fourth JPanel");
		p4.add(l4);
		p4.setBackground(Color.white);
		
		l5 = new JLabel("This is the fifth JPanel");
		p5.add(l5);
		p5.setBackground(Color.cyan);
		
		//设定鼠标事件的监听程序
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
	
		//将每个JPanel 作为一张卡片加入 frame 的内容窗格
		contentPane.add(p1, "First");  //"First"  是p1的名字
		contentPane.add(p2, "Second");  //"Second"是p2的名字
		contentPane.add(p3, "Third");  //"Third"  是p3的名字
		contentPane.add(p4, "Fourth");  //"Fourth"是p4的名字
		contentPane.add(p5, "Fifth");  //"Fifth"  是p5的名字
		
		//显示第一张卡片
		myCard.show(contentPane, "First");  //显示名为First的卡片
		frame.setSize(300, 200);
		frame.show();
		}
	
		//处理鼠标事件，每当按鼠标键时，即显示下一张卡片
		//如果已经显示最后一张，则重新显示第一张
	public void mouseClicked(MouseEvent e)
	{
		myCard.next(contentPane);
	}
}
