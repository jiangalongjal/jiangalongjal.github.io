package com.io;

import java.io.IOException;

public class PipedDome {

	public static void main(String[] args) {
		Send send=new Send();
		Receive rec= new Receive();
		try {
			send.getPos().connect(rec.getPis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(send).start();
		new Thread(rec).start();
		
	}

}
