package com.stream;

public class Bank {
	private final static int Max_size=10000;
	private int size;
	public Bank(int size){
		this.size=size;
	}
	//È¡¿î
	public synchronized void push(int number){
		if(getSize()-number<Max_size){
			setSize(getSize()-number);
		}else{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//´æ¿î
	public synchronized void pop(int number){
		if(getSize()+number<Max_size){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}else{
				
			}
		}
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	

}
