package com.take;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static void main(String[] arge){
		ServerSocket serverSocket =null;
		Socket socket=null;
		ArrayList<Socket> list = new ArrayList<Socket>();
		Map<String,Socket> socketHashMap=new HashMap<String,Socket>();
		try {
			serverSocket= new ServerSocket(3359);
			
			while(true){
				 socket = serverSocket.accept();

	                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	                String name = bufferedReader.readLine();
	                socketHashMap.put(name,socket);//映射名字和客户端。
	                list.add(socket);
	                new Thread(new ClientRunnable(socket,list,socketHashMap)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
