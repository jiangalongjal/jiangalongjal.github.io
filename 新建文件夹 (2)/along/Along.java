package com.along;
import java.util.Scanner;
import java.util.Arrays;

public class Along {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("***欢迎进入大智租车系统***");
		Along[] cars=new Along[6];
		System.out.println("***是否选择租车：（1）租车  （2）退出***");
		int input1=input.nextInt();
		if(input1==1){
			System.out.println("以下是我公司汽车租赁信息");
			cars[0]=new Auto(1,"奥迪A4",500.0,4,0,0};
			cars[1]=new Auto(2,"马自达6",400.0,4,0.0);
			
		}
		
	}

}
