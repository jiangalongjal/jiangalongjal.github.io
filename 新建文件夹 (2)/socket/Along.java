package com.socket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Along extends JFrame{
	public Along(){
		this.setLayout(null);
		JLabel jLable = new JLabel();
		jLable.setText("用户账号：");
		jLable.setBounds(120,10,70,30);
		this.add(jLable);
		JButton jbutton = new JButton();
		jbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("老师说：着火了");
			}
		} ); 
		
//		JTextField jtextfield = new JTextField();
//		jtextfield.setText("请输入账号");
//		jtextfield.setBounds(200, 10, 150, 30);
//		this.add(jtextfield);
//		
//		JLabel jlable = new JLabel();
//		jlable.setText("用户密码：");
//		jlable.setBounds(120,60,70,30);
//		this.add(jlable);
//		
//		JTextField jtextField = new JTextField();
//		jtextField.setText("请输入密码");
//		jtextField.setBounds(200, 60, 150, 30);
//		this.add(jtextField);
//		
//		JButton jbutton=new JButton();
//		jbutton.setText("点击登陆");
//		jbutton.setBounds(190, 110, 120, 50);
//		this.add(jbutton);
		
		this.setBounds(500,500,500,500);		
		this.setVisible(true);
		
	}
	public static void main(String[] arge){
		new Along();
	}

}
