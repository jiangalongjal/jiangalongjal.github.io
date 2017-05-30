package com.duihuakuang;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChuangKouFuWuRunnable implements Runnable {
	Socket socket = null;
	private List<Socket> sockets;
	Map<String,Socket> sHashMap = new HashMap<String,Socket>();
	public ChuangKouFuWuRunnable(Socket socket,List<Socket> sockets,Map<String, Socket> sHashMap) {
		this.socket = socket;
		this.sockets = sockets;
		this.sHashMap = sHashMap;
	}
	//�ж��߳�
	private boolean flag = true;
	
	
	public void DuiHuaFuWuRunnable(boolean flag) {
		this.flag = !flag;
	}


	public void run(){
		while(true){
			try {
				//��������
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = bufferedReader.readLine();
//				String xiaoxi = null;
//				xiaoxi = bufferedReader.readLine();
				//����������˭���͵���Ϣ
				Set<String> keys = sHashMap.keySet();
				String name = "";
				for(String bl:keys){
					Socket xm = sHashMap.get(bl);
					if(socket==xm){
						name = bl;
					}
				}
				
				
				System.out.println(name+"˵��"+xiaoxi);
				//��������
				String s = name+"˵:"+xiaoxi;
				for(Socket socket1:sockets){
					PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
					printWriter.write(s+"\n");
					//���������
					printWriter.flush();
				}
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}

