package com.stream;

public class Shengchan {
	private final static int MAX_SIZE=100;
	private int size;
	
	public Shengchan(int size){
		this.size=size;
	}
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			//输出内容
			setSize(number+getSize());
			System.out.println("生产了"+number+"当前库存为"+getSize());
		}else{
			//输出内容
			System.out.println("库存已满，停止生产");
			try {
				this.wait();//让想获取该对象锁的线程处在等待状态
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//通知消费者消费
		notifyAll();
	}
	//取货
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//消费
			setSize(getSize()-number);
			//输出内容
			System.out.println("消费成功"+number+",库存为"+getSize());
		}
		notifyAll();
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
