package com.stream;

public class SaleTickets implements Runnable{
    //����һ����ΪtiketCount�Ĳ���
	private int tiketCount=50;
	//new һ��ʵ��
	Object mutex=new Object();
	
	public void sellTicket(){
		//ʹ�ùؼ���synchronized����ȡ�ܵ�Ʊ��������ȥ1�Ĳ�������
		synchronized(mutex){
			if(tiketCount>0){
				tiketCount--;
				System.out.println(Thread.currentThread().getName()+"������Ʊ����ʣ"+tiketCount+"��Ʊ");
			}else{
				System.out.println("Ʊ����");
				return;
			}
		}
	}
	

	//ִ��sellTicket
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
