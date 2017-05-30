package com.qi;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServerFanHui implements Runnable {

	Socket socket;
	public ServerFanHui(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {

		Connection connection = DanLi.fanHui();
		
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

