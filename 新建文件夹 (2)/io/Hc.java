package com.io;

import java.io.BufferedWriter;

public class Hc {

	public static void main(String[] args, BufferedWriter bw) {
		// TODO Auto-generated method stub
		throws Exception{
			BufferedReder br = new BufferedReader(
					new FileReader("test.txt")
			);
			BufferedWriter bw=new BufferedWriter(
					new FileWriter("AA.txt")
			);
		}
		String line= null;
		while((line=br.readLine())!=null){//读一行
			bw.write(line);//写一行
			bw.newLine();//写完一行就换行
		}
		bw.close();
		br.close();
		
	}

}
