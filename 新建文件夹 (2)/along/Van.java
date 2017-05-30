package com.along;

public class Van extends Dome{
	private int person;
	private double good;
	public Van(int num,String name,double fee,int person,double good){
		super(num,name,fee);
		this.person=person;
		this.good=good;
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
	public String toString(){
		return num+"\t"+name+"\t"+fee+"Ìì/Ôª\t"+person+"ÈË\t"+good+"¶Ö\t";
	}

}
