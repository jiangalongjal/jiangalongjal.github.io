package com.duihuakuang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerSocketTest {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		List<Socket> list = new ArrayList<Socket>();
		Socket socket = null;
		Map<String,Socket> sHashMap= new HashMap<String,Socket>();
		try {
			//创建服务器
			serverSocket = new ServerSocket(3329);
			System.out.println("服务器创建成功");
			while(true){
				//监听服务器
				socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String name = bufferedReader.readLine();
				sHashMap.put(name,socket);
				
				list.add(socket);
				new Thread(new ChuangKouFuWuRunnable(socket, list, sHashMap)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

