package com.������;

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
			outputStream.write("������ëүү��".getBytes());
			   outputStream.close();
//			InputStream inputStream=(InputStream) serversocket.getInputStream();
//			byte[] bytes=new byte[1024];
//			int len=0;
//			StringBuffer stringBuffer=new StringBuffer();
//			while((len=inputStream.read(bytes))!=-1){
//				stringBuffer.append(new String(bytes,0,len));
//			}
//			
//			System.out.println("�������ˣ�"+stringBuffer.toString());
//			System.out.println("�ͻ��ˣ���������");
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
