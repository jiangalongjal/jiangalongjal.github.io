package com.io;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		//����Fileʵ��
		File file=new File("C://Users/������/workspace/com.io/src/com/io/text.txt");
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("name="+file.getName());//���������ļ�����
    	System.out.println("path="+file.getAbsolutePath());//�ļ�����ľ���·��
		System.out.println("name="+file.getPath());//�ļ�����·������
		System.out.println("parent="+file.getParent());//�ļ�����Ŀ¼
		System.out.println("length="+file.length());//
	}

}
