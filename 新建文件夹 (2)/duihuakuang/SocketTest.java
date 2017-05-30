package com.duihuakuang;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SocketTest extends JFrame {
	public SocketTest(Socket socket){
		this.setLayout(null);
		
		//消息框
		JTextArea jTextArea = new JTextArea();
		jTextArea.setOpaque(true);
		jTextArea.setBackground(Color.white);//填充背景色（白色）
		jTextArea.setBounds(0, 0, 700, 450);
		jTextArea.setEnabled(false);//文本框不可编辑状态
		this.add(jTextArea);
		
		//内容框
		JTextArea jTextArea2 = new JTextArea();
		jTextArea2.setOpaque(true);
		jTextArea2.setBackground(Color.white);
		jTextArea2.setBounds(0, 450, 700, 150);
		jTextArea2.setLineWrap(true);//自动换行
		this.add(jTextArea2);
		
		//QQ秀
		Icon icon = new ImageIcon ("src/com/ChuangKouQQ/640.jpg");
		JLabel jLabel = new JLabel();
		jLabel.setIcon(icon);
		jLabel.setBounds(700, 0, 220, 680);
		
		this.add(jLabel);		
		//发送按钮
		JButton jButton = new JButton("发送");
		jButton.setBounds(0, 600, 350, 40);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取用户输入的内容
				String xiaoxi = jTextArea2.getText();
				if(!"".equals(xiaoxi)){
					//找socket
					try {
						//发送消息
						PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
						printWriter.write(xiaoxi+"\n");
						printWriter.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				//清空消息
				jTextArea2.setText("");
				
			}
		});
		this.add(jButton);
		
		//关闭按钮
		JButton jButton2 = new JButton("关闭");
		jButton2.setBounds(350, 600, 350, 40);
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		this.add(jButton2);
		
		
		new Thread(new CKInRunnable(socket, jTextArea)).start();
		
		
		this.setBounds(200, 200, 920, 680);
		this.setTitle("2017java");
		//点击关闭结束程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("人大代表就一带一路问题讨论群");
		
	}
	public static void main(String[] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.147",3329);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//			printWriter.write("李四\n");
//			printWriter.write("张三\n");
			printWriter.write("习大大家的保姆\n");
//			printWriter.write("一带一路总规划\n");
//			printWriter.write("我叫你一声，你敢答应吗\n");
//			printWritee.weite("你叫一声试试\n");
			printWriter.flush();
			new SocketTest(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

