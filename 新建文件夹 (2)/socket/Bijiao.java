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
		jLabel.setText("请输入任意数字：");
		jLabel.setBounds(100, 100, 200, 50);
		this.add(jLabel);
		
		JTextArea jtextarea= new JTextArea();
		jtextarea.setBounds(200,100,200,50);
		this.add(jtextarea);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("随机数字：");
		jLabel1.setBounds(100, 200, 200, 50);
		this.add(jLabel1);
		
		JTextArea jtextarea1= new JTextArea();
		jtextarea1.setBounds(200,200,200,50);
		this.add(jtextarea1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("判定结果：");
		jLabel2.setBounds(100, 300, 200, 50);
		this.add(jLabel2);
		
		JTextArea jtextarea2= new JTextArea();
		jtextarea2.setText("");
		jtextarea2.setBounds(200,300,200,50);
		this.add(jtextarea2);
		//按钮（开始）
		JButton jButton=new JButton();
		jButton.setText("开始");
		jButton.setBounds(200,400,100,50);
		jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				flag=2;
				jtextarea2.setText("");
				new Thread(new Runnable(){
					//输出随机数
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
		//按钮（停止）
		JButton jbutton = new JButton();
		jbutton.setText("停止");
		jbutton.setBounds(350,400,100,50);
		jbutton.addActionListener(new ActionListener(){
			//比较随机数和输入数是否相等
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				flag=1;
				String a = jtextarea.getText();
				String a1= jtextarea1.getText();
				if(a.equals(a1)){
					jtextarea2.setText("相同");
				}else{
					jtextarea2.setText("不相同");
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
