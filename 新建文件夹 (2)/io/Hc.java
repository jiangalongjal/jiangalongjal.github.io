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
		while((line=br.readLine())!=null){//��һ��
			bw.write(line);//дһ��
			bw.newLine();//д��һ�оͻ���
		}
		bw.close();
		br.close();
		
	}

}
