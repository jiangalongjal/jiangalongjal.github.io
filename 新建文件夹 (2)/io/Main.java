package com.io;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		//创建File实例
		File file=new File("C://Users/姜阿龙/workspace/com.io/src/com/io/text.txt");
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("name="+file.getName());//所创建的文件名称
    	System.out.println("path="+file.getAbsolutePath());//文件储存的绝对路径
		System.out.println("name="+file.getPath());//文件储存路径名称
		System.out.println("parent="+file.getParent());//文件储存目录
		System.out.println("length="+file.length());//
	}

}
