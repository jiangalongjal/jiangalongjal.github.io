package com.take;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;

public class ShouRunnable implements Runnable {
	Socket socket;
	JLabel label;
	public ShouRunnable(Socket socket,JLabel labe){
		this.socket=socket;
		this.label=label;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				//接受服务器端返回的内容
				BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String neirong=bufferedreader.readLine(); 
				//显示到label
				label.setText(label.getText()+neirong);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
