package com.flush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Kehuduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			serverSocket=new ServerSocket(1234);
			socket=serverSocket.accept();
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xiaoxi =bufferedReader.readLine();
			System.out.println("客户端发送的内容为："+xiaoxi);
			String s="服务器返回消息："+xiaoxi;
			PrintWriter printWriter=new PrintWriter(socket.getOutputStream());
			printWriter.write(s);
			printWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
