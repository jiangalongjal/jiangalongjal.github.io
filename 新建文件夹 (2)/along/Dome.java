package com.along;

public class Dome {
	int num;
	String  name;
	double fee;
	int person;
	double good;
	
	public Dome(int num,String name,double fee){
		this.num=num;
		this.name=name;
		this.fee=fee;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public double getGood() {
		return good;
	}

	public void setGood(double good) {
		this.good = good;
	}
}
