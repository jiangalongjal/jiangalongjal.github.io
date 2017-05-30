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
		
		//��Ϣ��
		JTextArea jTextArea = new JTextArea();
		jTextArea.setOpaque(true);
		jTextArea.setBackground(Color.white);//��䱳��ɫ����ɫ��
		jTextArea.setBounds(0, 0, 700, 450);
		jTextArea.setEnabled(false);//�ı��򲻿ɱ༭״̬
		this.add(jTextArea);
		
		//���ݿ�
		JTextArea jTextArea2 = new JTextArea();
		jTextArea2.setOpaque(true);
		jTextArea2.setBackground(Color.white);
		jTextArea2.setBounds(0, 450, 700, 150);
		jTextArea2.setLineWrap(true);//�Զ�����
		this.add(jTextArea2);
		
		//QQ��
		Icon icon = new ImageIcon ("src/com/ChuangKouQQ/640.jpg");
		JLabel jLabel = new JLabel();
		jLabel.setIcon(icon);
		jLabel.setBounds(700, 0, 220, 680);
		
		this.add(jLabel);		
		//���Ͱ�ť
		JButton jButton = new JButton("����");
		jButton.setBounds(0, 600, 350, 40);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�û����������
				String xiaoxi = jTextArea2.getText();
				if(!"".equals(xiaoxi)){
					//��socket
					try {
						//������Ϣ
						PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
						printWriter.write(xiaoxi+"\n");
						printWriter.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				//�����Ϣ
				jTextArea2.setText("");
				
			}
		});
		this.add(jButton);
		
		//�رհ�ť
		JButton jButton2 = new JButton("�ر�");
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
		//����رս�������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("�˴�����һ��һ·��������Ⱥ");
		
	}
	public static void main(String[] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.147",3329);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//			printWriter.write("����\n");
//			printWriter.write("����\n");
			printWriter.write("ϰ���ҵı�ķ\n");
//			printWriter.write("һ��һ·�ܹ滮\n");
//			printWriter.write("�ҽ���һ������Ҵ�Ӧ��\n");
//			printWritee.weite("���һ������\n");
			printWriter.flush();
			new SocketTest(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

