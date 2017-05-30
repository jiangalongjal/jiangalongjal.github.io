package com.socket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Baocun {
	public static void  baocun(){
		File file = new File("baocun.tex");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String s=Main.wb;
		FileWriter fw;
		try {
			fw=new FileWriter(file);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
