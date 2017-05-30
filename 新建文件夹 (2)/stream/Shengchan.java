package com.stream;

public class Shengchan {
	private final static int MAX_SIZE=100;
	private int size;
	
	public Shengchan(int size){
		this.size=size;
	}
	//���
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			//�������
			setSize(number+getSize());
			System.out.println("������"+number+"��ǰ���Ϊ"+getSize());
		}else{
			//�������
			System.out.println("���������ֹͣ����");
			try {
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//֪ͨ����������
		notifyAll();
	}
	//ȡ��
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//����
			setSize(getSize()-number);
			//�������
			System.out.println("���ѳɹ�"+number+",���Ϊ"+getSize());
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
