package com.io;

public class Ssl {

	public static void main(String[] args) {
		OutputStreamwriter osw=new OutputStreamwriter(
				new FileOutputStream("path")
		);
	osw.writer("mricosoftibmsunapplehp");
	System.out.println(osw.getEncoding());
	osw.close();
	osw=new OutputStreamWriter(
			new FileOutputStream("path",true),"ISO8859_1"
			);
	
	}

}
