package com.stream;

public class Jincheng {

	public static void main(String[] args) {
		SaleTickets runTicekt = new SaleTickets();
		Thread th1 = new Thread(runTicekt, "����1");
	    Thread th2 = new Thread(runTicekt, "����2");
	    Thread th3 = new Thread(runTicekt, "����3");
		th1.start();
		th2.start();
		th3.start();
		@SuppressWarnings("unused")
		int count=Thread.activeCount();
		System.out.println("����һ����Ʊ��"+count(th1)+"��");
		System.out.println("���ڶ�����Ʊ��"+count(th2)+"��");
		System.out.println("����������Ʊ��"+count(th3)+"��");

	}

	private static String count(Thread th2) {
		// TODO Auto-generated method stub
		return null;
	}


}
