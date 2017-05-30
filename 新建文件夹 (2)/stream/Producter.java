package com.stream;

public class Producter implements Runnable {
	private Shengchan shengchan;
	private int number;
	public Producter(Shengchan shengchan,int number){
		this.shengchan=shengchan;
		this.number=number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			shengchan.push(number);
		}
		
	}

}
