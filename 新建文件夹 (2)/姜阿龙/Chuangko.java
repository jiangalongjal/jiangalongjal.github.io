package com.姜阿龙;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class Chuangko {

	private static Socket seversocket;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			while(true){
				ServerSocket serversocket=new ServerSocket(3321);//创建服务器端并注册端口
				System.out.println("创建成功");					
				Socket socket=serversocket.accept();//监听对应端口
				java.io.InputStream inputStream =socket.getInputStream();
				byte[] bytes=new byte[1024];
				int len=0;
				StringBuffer stringbuffer=new StringBuffer();
				while((len=inputStream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("服务器端：你是来干什么的");
				System.out.println("客户端："+stringbuffer.toString());
				inputStream.close();
				   inputStream.read();
//				OutputStream outputString=(OutputStream) seversocket.getOutputStream();
//				outputString.write("来看毛爷爷干嘛".getBytes());
//				outputString.close();

				//String address= new String(socket.getInetAddress().getHostName());
				System.out.println("用户地址为："+socket.getInetAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
