package com.姜阿龙;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileDemo {

	public static void main(String[] args) {
		XieRu ru1 = new XieRu("涓�");
		XieRu ru2 = new XieRu("浜�");
		XieRu ru3 = new XieRu("涓�");
		MyThread myThread1 = new MyThread(ru1);
		MyThread myThread2 = new MyThread(ru2);
		MyThread myThread3 = new MyThread(ru3);
		new Thread(myThread1).start();
		new Thread(myThread2).start();
		new Thread(myThread3).start();
	}

}
