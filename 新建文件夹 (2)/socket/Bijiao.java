package com.socket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Bijiao extends JFrame {
	int flag=0;
	public Bijiao(){
		
		this.setLayout(null);
		JLabel jLabel = new JLabel();
		jLabel.setText("�������������֣�");
		jLabel.setBounds(100, 100, 200, 50);
		this.add(jLabel);
		
		JTextArea jtextarea= new JTextArea();
		jtextarea.setBounds(200,100,200,50);
		this.add(jtextarea);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("������֣�");
		jLabel1.setBounds(100, 200, 200, 50);
		this.add(jLabel1);
		
		JTextArea jtextarea1= new JTextArea();
		jtextarea1.setBounds(200,200,200,50);
		this.add(jtextarea1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("�ж������");
		jLabel2.setBounds(100, 300, 200, 50);
		this.add(jLabel2);
		
		JTextArea jtextarea2= new JTextArea();
		jtextarea2.setText("");
		jtextarea2.setBounds(200,300,200,50);
		this.add(jtextarea2);
		//��ť����ʼ��
		JButton jButton=new JButton();
		jButton.setText("��ʼ");
		jButton.setBounds(200,400,100,50);
		jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				flag=2;
				jtextarea2.setText("");
				new Thread(new Runnable(){
					//��������
					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(flag==2){
							jtextarea1.setText((int)(Math.random()*999+1)+"");
						}
					}
					
				}).start();
			}
			
		});
		this.add(jButton);
		//��ť��ֹͣ��
		JButton jbutton = new JButton();
		jbutton.setText("ֹͣ");
		jbutton.setBounds(350,400,100,50);
		jbutton.addActionListener(new ActionListener(){
			//�Ƚ���������������Ƿ����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				flag=1;
				String a = jtextarea.getText();
				String a1= jtextarea1.getText();
				if(a.equals(a1)){
					jtextarea2.setText("��ͬ");
				}else{
					jtextarea2.setText("����ͬ");
				}
			}
			
		});
		this.add(jbutton);
		
		this.setBounds(500,500,700,700);
		this.setVisible(true);
		
		
	}
	public static void main(String[] arge){
		new Bijiao();
	}

}
