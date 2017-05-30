package com.javaNO1;

public  class A{
	public void prt(){
		System.out.println("1");
	}
	public A(){
		System.out.println("A");
	}
	public static void main(String[] args) {
		A a=new B();
		a=new A();
	}
}
