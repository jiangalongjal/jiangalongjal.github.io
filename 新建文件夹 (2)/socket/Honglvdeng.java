package com.socket;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Honglvdeng extends JFrame{
	public Honglvdeng(){
		this.setLayout(null);
		JButton jButton = new JButton();
		jButton.setText("��ʼ");
		jButton.setBounds(0,0,150,50);
		this.add(jButton);
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("��ƣ���ֹͣͨ��");
		jtextarea.setBounds(100,100,450,150);
		jtextarea.setBackground(Color.red);
		this.add(jtextarea);
		
		jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Thread(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(true){
							try {
								Thread.sleep(5000);
								jtextarea.setText("�̵ƣ��밲ȫͨ��");
								jtextarea.setBackground(Color.green);
								Thread.sleep(5000);
								jtextarea.setText("�Ƶƣ����Ե�");
								jtextarea.setBackground(Color.yellow);
								Thread.sleep(5000);
								jtextarea.setText("��ƣ���ֹͣͨ��");
								jtextarea.setBackground(Color.red);
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
					
				}).start();
				
			}
			
		});
		
		this.setTitle("���̵�");
		this.setBounds(500,500,700,700);
		this.setVisible(true);
		
		
	}
	public static void main (String[] arge) {
		new Honglvdeng();
	}
}
