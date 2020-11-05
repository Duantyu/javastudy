package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class TwoStatesButtonDemo2 {
	JFrame frame = new JFrame("Two States Button Demo 2");
	
	JCheckBox cb1 = new JCheckBox("JCheckBox 1");
	JCheckBox cb2 = new JCheckBox("JCheckBox 2");
	JCheckBox cb3 = new JCheckBox("JCheckBox 3");
	
	JCheckBox cb4 = new JCheckBox("JCheckBox 4");
	JCheckBox cb5 = new JCheckBox("JCheckBox 5");
	JCheckBox cb6 = new JCheckBox("JCheckBox 6");
	
	JRadioButton rb1 = new JRadioButton("JRadioButton 1");
	JRadioButton rb2 = new JRadioButton("JRadioButton 2");
	JRadioButton rb3 = new JRadioButton("JRadioButton 3");
	
	JRadioButton rb4 = new JRadioButton("JRadioButton 4");
	JRadioButton rb5 = new JRadioButton("JRadioButton 5");
	JRadioButton rb6 = new JRadioButton("JRadioButton 6");
	
	//������ʾ������ı���
	JTextArea ta = new JTextArea();
	
	public static void main(String args[])
	{
		TwoStatesButtonDemo2 ts = new TwoStatesButtonDemo2();
		ts.go();
	}
	
	public void go()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel pa = new JPanel();
		JPanel pb = new JPanel();
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched, "JCheckBox");
		//���ñ߿�
		p1.setBorder(border);
		
		p2.add(cb4);
		p2.add(cb5);
		p2.add(cb6);
		border = BorderFactory.createTitledBorder(etched, "JCheckBoxGroup");
		//���ñ߿�
		p2.setBorder(border);
		
		//���� ButtonGroup ��ť�飬����������Ӱ�ť
		ButtonGroup group1 = new ButtonGroup();
		group1.add(cb4);
		group1.add(cb5);
		group1.add(cb6);
		
		p3.add(rb1);
		p3.add(rb2);
		p3.add(rb3);
		border = BorderFactory.createTitledBorder(etched, "JRadioButton");
		//���ñ߿�
		p3.setBorder(border);
		
		p4.add(rb4);
		p4.add(rb5);
		p4.add(rb6);
		border = BorderFactory.createTitledBorder(etched, "JRadioButton Group");
		//���ñ߿�
		p4.setBorder(border);
		
		//���� ButtonGroup ��ť�飬����������Ӱ�ť
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rb4);
		group2.add(rb5);
		group2.add(rb6);
		
		JScrollPane jp = new JScrollPane(ta);
		p5.setLayout(new BorderLayout());
		p5.add(jp);
		border = BorderFactory.createTitledBorder(etched, "Results");
		//���ñ߿�
		p5.setBorder(border);
		
		ItemListener il = new ItemListener()
				{
			public void itemStateChanged(ItemEvent e) {
				//ȡ���¼�Դ
				JCheckBox cb = (JCheckBox) e.getSource();
				if (cb == cb1) {
					ta.append("\n JCheckBox Button 1" + cb1.isSelected());
				}else if (cb == cb2) {
					ta.append("\n JCheckBox Button 2" + cb2.isSelected());
				}else if (cb == cb3) {
					ta.append("\n JCheckBox Button 3" + cb3.isSelected());
				}else if (cb == cb4) {
					ta.append("\n JCheckBox Button 4" + cb4.isSelected());
				}else if (cb == cb5) {
					ta.append("\n JCheckBox Button 5" + cb5.isSelected());
				}else {
					ta.append("\n JCheckBox Button 6" + cb6.isSelected());
				}
			}
				};
		cb1.addItemListener(il);
		cb2.addItemListener(il);
		cb3.addItemListener(il);
		cb4.addItemListener(il);
		cb5.addItemListener(il);
		cb6.addItemListener(il);
		
		ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ȡ���¼�Դ
				JRadioButton rb = (JRadioButton) e.getSource();
			if(rb == rb1) {
				ta.append("\n You selected Radio Button 1"+ rb1.isSelected());
			}else if(rb == rb2) {
				ta.append("\n You selected Radio Button 2"+ rb2.isSelected());
			}else if(rb == rb3) {
				ta.append("\n You selected Radio Button 3"+ rb3.isSelected());
			}else if(rb == rb4) {
				ta.append("\n You selected Radio Button 4"+ rb4.isSelected());
			}else if(rb == rb5) {
				ta.append("\n You selected Radio Button 5"+ rb5.isSelected());
			}else {
				ta.append("\n You selected Radio Button 6"+ rb6.isSelected());
			}
			}
		};
		
		rb1.addActionListener(a1);
		rb2.addActionListener(a1);
		rb3.addActionListener(a1);
		rb4.addActionListener(a1);
		rb5.addActionListener(a1);
		rb6.addActionListener(a1);
		
		pa.setLayout(new GridLayout(0, 1));
		pa.add(p1);
		pa.add(p2);

		pb.setLayout(new GridLayout(0, 1));
		pb.add(p3);
		pb.add(p4);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0, 1));
		cp.add(pa);
		cp.add(pb);
		cp.add(p5);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
