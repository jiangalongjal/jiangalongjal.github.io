package com.along;

public class Goods extends Dome{
	private double good;
	public Goods(int num,String name,double fee,double good){
		super(num,name,fee);
		this.good=good;
	}
	public double getGood() {
		return good;
	}
	public void setGood(double good) {
		this.good = good;
	}
	public String toString(){
		return num+"\t"+name+"\t"+fee+"Ôª/Ìì\t"+person+"ÈË\t"+good+"¶Ö\t";
	}

}
