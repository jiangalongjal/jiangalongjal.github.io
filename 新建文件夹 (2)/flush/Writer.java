package com.flush;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try {
			socket=new Socket("192.168.199.146",3369);
			PrintWriter printWriter=new PrintWriter(socket.getOutputStream());
			printWriter.write("Hello\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
