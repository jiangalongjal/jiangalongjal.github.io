package com.javaNO1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Dome5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.text");
		String filename =file.getName();
		File file1 = new File(""+filename);
		if(!file1.exists()){//
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println(filename);
		try {
			FileReader filereader = new FileReader(file);
			StringBuffer s = new StringBuffer();
			int len = 0;
			char[] chars = new char[1024];
			try {
				while((len=filereader.read(chars))!=-1){
					s.append(new String(chars,0,len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileWriter fileWriter = new FileWriter(file1);
				String ss = s.toString();
				fileWriter.write(ss);
				filereader.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

























