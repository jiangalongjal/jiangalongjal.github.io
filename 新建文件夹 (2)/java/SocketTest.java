package com.java;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SocketTest extends JFrame{
	public SocketTest(){
		this.setLayout(null);
		//对话框
		JTextArea jTextArea=new JTextArea();
		jTextArea.setBounds(0,0,600,400);
		jTextArea.setBackground(Color.blue);
		this.add(jTextArea);
		this.setBounds(200,200,800,600);
		this.setTitle("一带一路问题讨论群");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] arge){
		new SocketTest();
	}

}
