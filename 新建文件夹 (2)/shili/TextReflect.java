package com.shili;

import java.io.Serializable;

public class TextReflect implements Serializable{
	private static final long serialVersionUID=-2862585049955236662l;
	public static void main(String[] arge){
		try {
			Class<?> clazz = Class.forName("com.shili.TextReflect");
			Class<?> parentClass = clazz.getSuperclass();
			System.out.println("calzz�ĸ���Ϊ ��"+parentClass.getName());
			Class<?> intes[] = clazz.getInterfaces();
			System.out .print("clazzʵ�ֵĵĽӿ��� ��");
			for(int i=0;i<intes.length;i++){
				System.out.println((i+1)+":"+intes[i].getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
