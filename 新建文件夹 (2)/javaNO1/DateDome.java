package com.javaNO1;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateDome implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			System.out.println(sj.format(new Date(0)));
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
