package com.along;

public class Auto extends Dome {
	private int person;
	public Auto(int num,String name,double fee,int person){
		super(num,name,fee);
		this.person=person;
		
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public String toString(){
		return num+"\t"+name+"\t"+fee+"Ìì/Ôª\t"+person+"ÈË\t"+good+"¶Ö\t";
	}

}
