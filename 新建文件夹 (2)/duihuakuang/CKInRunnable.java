package com.duihuakuang;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JTextArea;
/**
 * ������Ϣ���̣߳�
 * */
public class CKInRunnable implements Runnable {
	Socket socket = null;
	JTextArea jTextArea;
	
	public CKInRunnable(Socket socket,JTextArea jTextArea){
		super();
		this.socket = socket;
		this.jTextArea = jTextArea;
	}
	public void run(){
		while(true){
			try {
				//���շ������˷��ص�����
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String fanhui = bufferedReader.readLine();
				//��ʾ��jlable
				jTextArea.setText(jTextArea.getText()+"\n"+fanhui);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

