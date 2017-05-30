package com.flush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try {
			socket=new Socket("192.168.199.146",1234);
			PrintWriter printWriter=new PrintWriter(socket.getOutputStream());
			printWriter.write("Hello\n");
			printWriter.flush();
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fanhui=bufferedReader.readLine();
			System.out.println("服务器端返回消息："+fanhui);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
