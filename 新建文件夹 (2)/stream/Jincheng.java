package com.stream;

public class Jincheng {

	public static void main(String[] args) {
		SaleTickets runTicekt = new SaleTickets();
		Thread th1 = new Thread(runTicekt, "窗口1");
	    Thread th2 = new Thread(runTicekt, "窗口2");
	    Thread th3 = new Thread(runTicekt, "窗口3");
		th1.start();
		th2.start();
		th3.start();
		@SuppressWarnings("unused")
		int count=Thread.activeCount();
		System.out.println("窗口一共售票："+count(th1)+"张");
		System.out.println("窗口二共售票："+count(th2)+"张");
		System.out.println("窗口三共售票："+count(th3)+"张");

	}

	private static String count(Thread th2) {
		// TODO Auto-generated method stub
		return null;
	}


}
