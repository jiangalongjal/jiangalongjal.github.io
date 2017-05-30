package com.take;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Client extends JFrame{
	
	public Client(){
		this.setLayout(null);
		//创建元素
		JLabel label=new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setBounds(0, 0, 600, 300);
		this.add(label);
		
		JTextField filed=new JTextField();
		filed.setBounds(0,300, 600, 30);
		this.add(filed);
		
		JButton jButton = new JButton();
		jButton.setText("发送");
		jButton.setBounds(30, 330, 70,30);
		jButton.addActionListener(new ActionListener(){

			//private Socket socket;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//获取用户输入内容
				String neirong = filed.getText();
				if(!"".equals(neirong)){
					
					//找到socket
					try {
						Socket socket = null;
						PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
						printwriter.write(neirong+"\n");
						printwriter.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				filed.setText("");				
				//发送
				//清空
			}
			
		});
		this.add(jButton);
		Socket socket = null;
		new Thread(new ShouRunnable(socket,label));
		this.setBounds(500,500,600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] arge){
		Socket socket=null;
		try {
			socket=new Socket("192.168.199.146",3359);
			PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
			printwriter.write("姜漾：\n");
			printwriter.flush();
			new Client();
			
			
			
			new Client();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
