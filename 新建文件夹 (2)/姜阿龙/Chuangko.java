package com.������;

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
				ServerSocket serversocket=new ServerSocket(3321);//�����������˲�ע��˿�
				System.out.println("�����ɹ�");					
				Socket socket=serversocket.accept();//������Ӧ�˿�
				java.io.InputStream inputStream =socket.getInputStream();
				byte[] bytes=new byte[1024];
				int len=0;
				StringBuffer stringbuffer=new StringBuffer();
				while((len=inputStream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("�������ˣ���������ʲô��");
				System.out.println("�ͻ��ˣ�"+stringbuffer.toString());
				inputStream.close();
				   inputStream.read();
//				OutputStream outputString=(OutputStream) seversocket.getOutputStream();
//				outputString.write("����ëүү����".getBytes());
//				outputString.close();

				//String address= new String(socket.getInetAddress().getHostName());
				System.out.println("�û���ַΪ��"+socket.getInetAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
