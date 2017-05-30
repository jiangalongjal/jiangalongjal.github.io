package com.micro;

public class Shiyan {
	public static void main(String[] args){
		System.out.println("begin");
		divide(17/0);
		System.out.println("ending");
	}
	public static void divide(int a,int b){
		int c= a/b;
	}
}

