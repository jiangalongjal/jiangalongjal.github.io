package com.stream;

public class Ck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shengchan shengchan=new Shengchan(0);
		//生产者
		Xiaofei xiaofei1=new Xiaofei(shengchan,20);
		Xiaofei xiaofei2=new Xiaofei(shengchan,70);
		Xiaofei xiaofei3=new Xiaofei(shengchan,40);
		
		//消费者
		Producter producter1=new Producter(shengchan,60);
		Producter producter2=new Producter(shengchan,20);
		Producter producter3=new Producter(shengchan,80);
		
		//启动生产者和消费者
		new Thread(xiaofei1).start();
		new Thread(xiaofei2).start();
		new Thread(xiaofei3).start();
		new Thread(producter1).start();
		new Thread(producter2).start();
		new Thread(producter3).start();
		
	}

}
