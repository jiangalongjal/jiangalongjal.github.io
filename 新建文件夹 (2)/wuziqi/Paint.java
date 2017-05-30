package com.wuziqi;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Paint extends JFrame{
	public  Paint(){
		this.setLayout(null);
		TestPaint text = new TestPaint();
		text.setBounds(30, 30, 550, 550);
		
		this.setTitle("五子棋");
		
		JButton jButton = new JButton("开始");
		jButton.setBounds(600, 100, 100, 40);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Paint.this.add(text);
				Paint.this.repaint();
			}
		});
		this.add(jButton);
		
		
		
		JButton jButton2 = new JButton("重新开始");
		jButton2.setBounds(600, 180, 100, 40);
		jButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text.isWinNow = false;
				text.pointList.clear();
				text.isHei=true;
				text.repaint();

			}
		});
		this.add(jButton2);
		
		this.setBounds(200,200,750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args){
		new Paint();
	}
}

