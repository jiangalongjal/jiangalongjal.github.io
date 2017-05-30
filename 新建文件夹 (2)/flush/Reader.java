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
			System.out.println("创建成功，等待连接");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xiaoxi=bufferedReader.readLine();
			System.out.println("客户端返回内容为："+xiaoxi);
			//System.out.println("用户地址为："+socket.getInetAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
