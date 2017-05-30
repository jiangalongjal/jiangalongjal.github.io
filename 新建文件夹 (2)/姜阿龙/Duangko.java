package com.姜阿龙;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.InputStream;


//import org.omg.CORBA.portable.OutputStream;

public class Duangko {

	private static Socket serversocket;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket=new Socket("192.168.199.146",3321);
			//System.out.println(socket.isConnected());
			OutputStream outputStream=(OutputStream) socket.getOutputStream();
			outputStream.write("我来看毛爷爷的".getBytes());
			   outputStream.close();
//			InputStream inputStream=(InputStream) serversocket.getInputStream();
//			byte[] bytes=new byte[1024];
//			int len=0;
//			StringBuffer stringBuffer=new StringBuffer();
//			while((len=inputStream.read(bytes))!=-1){
//				stringBuffer.append(new String(bytes,0,len));
//			}
//			
//			System.out.println("服务器端："+stringBuffer.toString());
//			System.out.println("客户端：？？？？");
//			inputStream.close();
//			inputStream.read();
} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
