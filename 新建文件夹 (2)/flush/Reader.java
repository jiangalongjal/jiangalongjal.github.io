package com.flush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			serverSocket=new ServerSocket(3369);
			socket=serverSocket.accept();
			System.out.println("�����ɹ����ȴ�����");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xiaoxi=bufferedReader.readLine();
			System.out.println("�ͻ��˷�������Ϊ��"+xiaoxi);
			//System.out.println("�û���ַΪ��"+socket.getInetAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
