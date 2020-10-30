package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo implements ItemListener, ActionListener {
		JFrame frame = new JFrame("Menu Demo");
		JTextField tf = new JTextField();
	public static void main(String args[])
	{
		MenuDemo menuDemo = new MenuDemo();
		menuDemo.go();
	}
	
	public void go()
	{
		//菜单栏
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		//菜单和子菜单
		JMenu menu,submenu; 
		//菜单项
		JMenuItem menuItem;
		
		//建立 File 菜单
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menubar.add(menu);
		
		//File 中的菜单项
		menuItem = new JMenuItem("Open...");
		//设置快捷键
		menuItem.setMnemonic(KeyEvent.VK_O);
		//设置加速键
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save", KeyEvent.VK_S);
		menuItem.addActionListener(this);
		//设置为不可用
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Close");
		menuItem.setMnemonic(KeyEvent.VK_C);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		//加入分割线
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic(KeyEvent.VK_E);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		//建立Option菜单
		menu = new JMenu("Option");
		menubar.add(menu);
		
		//Option 中的菜单项
		menu.add("Front...");
		//建立子菜单
		submenu = new JMenu("Color...");
		menu.add(submenu);
		
		menuItem = new JMenuItem("Foreground");
		menuItem.addActionListener(this);
		//设置加速键
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		
		//加入分割线
		menu.addSeparator();
		JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Always On Top");
		cm.addItemListener(this);
		menu.add(cm);
		
		menu.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small", true);
		rm.addItemListener(this);
		menu.add(rm);
		ButtonGroup group = new ButtonGroup();
		group.add(rm);
		
		rm = new JRadioButtonMenuItem("Large");
		rm.addItemListener(this);
		menu.add(rm);
		group.add(rm);
		
		//建立 Help 菜单
		menu = new JMenu("Help");
		menubar.add(menu);
		
		menuItem = new JMenuItem("about...", new ImageIcon("dukeWaveRed.gif"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		//设置为不可编辑
		tf.setEditable(false);
		
		Container cp = frame.getContentPane();
		cp.add(tf, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
	
	//实现 ItemListener 接口中的方法
	public void itemStateChanged(ItemEvent e)
	{
		int state = e.getStateChange();
		JMenuItem amenuItem = (JMenuItem)e.getSource();
		String command = amenuItem.getText();
		if(state == ItemEvent.SELECTED)
			tf.setText(command+"SELECTED");
		else
			tf.setText(command+"DESELECTED");
	}
	
	//实现 ActionListener 接口的方法
	public void actionPerformed(ActionEvent e)
	{
		tf.setText(e.getActionCommand());
		
		if(e.getActionCommand() == "Exit")
		{
			System.exit(0);
		}
	}
}
