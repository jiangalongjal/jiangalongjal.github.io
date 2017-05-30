package com.stream;

public class SaleTickets implements Runnable{
    //设置一个名为tiketCount的参数
	private int tiketCount=50;
	//new 一个实例
	Object mutex=new Object();
	
	public void sellTicket(){
		//使用关键词synchronized将读取总的票数，并减去1的操作锁定
		synchronized(mutex){
			if(tiketCount>0){
				tiketCount--;
				System.out.println(Thread.currentThread().getName()+"正在售票，还剩"+tiketCount+"张票");
			}else{
				System.out.println("票售罄");
				return;
			}
		}
	}
	

	//执行sellTicket
	public void run() {
		while(tiketCount>0){
			sellTicket();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
