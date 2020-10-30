package test;

//JFrame ʵ�������ݴ���ָ����һ��CardLayout���͵Ĳ��ֹ�������Ȼ�������м�����5�ſ�Ƭ��ÿ�ſ�Ƭ����JPanel���һ��ʵ�������Ҿ��в�ͬ�ı�����ɫ��ÿ�����򴰿ڰ�����꣬��һ�ſ�Ƭ�ͻ���ʾ������
import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

public class CardLayoutDemo extends MouseAdapter
{
	JPanel p1, p2, p3, p4, p5;
	JLabel l1, l2, l3, l4, l5;
	
	//����һ�� CardLayout ����
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
		
		//���� CardLayout ���ֹ�����
		contentPane.setLayout(myCard);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
	
		//Ϊÿ��JPanel ����һ����ǩ���趨��ͬ�ı�����ɫ���Ա�������
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
		
		//�趨����¼��ļ�������
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
	
		//��ÿ��JPanel ��Ϊһ�ſ�Ƭ���� frame �����ݴ���
		contentPane.add(p1, "First");  //"First"  ��p1������
		contentPane.add(p2, "Second");  //"Second"��p2������
		contentPane.add(p3, "Third");  //"Third"  ��p3������
		contentPane.add(p4, "Fourth");  //"Fourth"��p4������
		contentPane.add(p5, "Fifth");  //"Fifth"  ��p5������
		
		//��ʾ��һ�ſ�Ƭ
		myCard.show(contentPane, "First");  //��ʾ��ΪFirst�Ŀ�Ƭ
		frame.setSize(300, 200);
		frame.show();
		}
	
		//��������¼���ÿ��������ʱ������ʾ��һ�ſ�Ƭ
		//����Ѿ���ʾ���һ�ţ���������ʾ��һ��
	public void mouseClicked(MouseEvent e)
	{
		myCard.next(contentPane);
	}
}
