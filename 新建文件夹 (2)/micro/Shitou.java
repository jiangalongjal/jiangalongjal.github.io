package com.micro;
import java.util.*;
public class Shitou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		System.out.println("---欢迎进入猜拳游戏---");
		System.out.println("请选择你要输出的动作：1 石头；2剪刀；3 布");
		int a=sc.nextInt();
		switch(a){
			case 1:System.out.println("石头");break;
			case 2:System.out.println("剪刀");break;
			case 3:System.out.println("布");break;
		}
		int b=(int)(Math.random()*3+1);
		switch(b){
			case 1:System.out.println("石头");break;
			case 2:System.out.println("剪刀");break;
			case 3:System.out.println("布");break;
		}
		if(a==b){
			System.out.println("平局");
		}else if(a>b&&a!=2){
			System.out.println("你赢了！");
		}else if(a<b&&a!=1){
			System.out.println("你赢了！");
		}else if(a<b&&a!=3){
			System.out.println("你赢了！");
		}else{
			System.out.println("很遗憾，你输了！");
		}
	
		
	}

}
