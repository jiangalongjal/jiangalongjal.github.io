package com.姜阿龙;

import java.io.*;
public class XieRu{
	private String name;
	public XieRu(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 鏂规硶涓�鍐欏叆浠�0鍒扮櫨鍒嗕箣涓夊崄鐨勫唴瀹�
	 */
	public void fangFa(){
		//瀹炰緥鍖栨枃浠�
		File file  = new File("src/com/hong/hongkun.txt");
		FileReader fileReader = null;
		try {
			//灏嗘枃浠惰鍏�
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//瀹氫箟涓�涓瓧绗︿覆瀵硅薄鐢ㄦ潵鍌ㄥ瓨璇诲叆鐨勬暟鎹�
		StringBuffer sss = new StringBuffer();
		int len = 0;
		char[] chars = new char[1024] ;
		try {
			while((len = fileReader.read(chars))!=-1){
				//浠庢枃浠剁殑寮�濮嬪埌涓夊垎涔嬩竴澶勭粨鏉�
				sss.append(new String(chars,0,(len/3)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//鍏抽棴杈撳叆娴�
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//瀹炰緥鍖栭渶瑕佸鍒惰繘鍏ョ殑鏂囦欢
		File file1 = new File("src/com/hong/qihongkun.txt");
		//濡傛灉璇ユ枃浠朵笉瀛樺湪鍒欏垱寤烘枃浠�
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//灏嗘枃浠跺啓鍏�
		FileWriter output=null;
		try {
			output = new FileWriter(file1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//灏嗚鍏ョ殑鏂囦欢璧嬬粰涓�涓柊鐨勫瓧绗︿覆
		String bbb =sss.toString();
		//灏嗗瓧绗︿覆杩涜鍐欏叆
		try {
			output.write(bbb);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			//鍏抽棴娴�
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//瀹炰緥鍖栦竴涓緭鍑烘祦
		FileReader fileReader2=null;
		try {
			fileReader2 = new FileReader(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int len1 = 0;
		char[] ccc = new char[1024];
		StringBuffer ss = new StringBuffer();
		//灏嗗唴瀹硅繘琛岃緭鍑哄嚭鍘�
		try {
			while((len = fileReader2.read(ccc))!=-1){
				ss.append(new String(ccc,0,len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//杈撳嚭鏂囦欢鍐呭
		System.out.println(ss.toString());
	}
	/**
	 *鏂规硶浜屽啓鍏ョ櫨鍒嗕箣涓夊崄鍒扮櫨鍒嗕箣鍏崄
	 * @throws IOException
	 */
	public void fangFa2() throws IOException{
		File file  = new File("src/com/hong/hongkun.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuffer sss = new StringBuffer();
		int len = 0;
		char[] chars = new char[1024] ;
		while((len = fileReader.read(chars))!=-1){
			sss.append(new String(chars,(len/3),(len/3+len/3)));
		}
		fileReader.close();
		File file1 = new File("src/com/hong/qihongkun.txt");
		if(!file1.exists()){
			file1.createNewFile();
		}
		FileWriter output = new FileWriter(file1);
		String bbb =sss.toString();
		output.write(bbb);
		output.close();
		FileReader fileReader2 = new FileReader(file1);
		int len1 = 0;
		char[] ccc = new char[1024];
		StringBuffer ss = new StringBuffer();
		while((len = fileReader2.read(ccc))!=-1){
			ss.append(new String(ccc,0,len));
		}
	}
	/**
	 * 鏂规硶涓夊啓鍏ョ櫨鍒嗕箣鍏崄鍒版渶鍚�
	 * @throws IOException
	 */
	public void fangFa3() throws IOException{
		File file  = new File("src/com/hong/hongkun.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuffer sss = new StringBuffer();
		int len = 0;
		char[] chars = new char[1024] ;
		while((len = fileReader.read(chars))!=-1){
			sss.append(new String(chars,(len/3+len/3),len));
		}
		fileReader.close();
		File file1 = new File("src/com/hong/qihongkun.txt");
		if(!file1.exists()){
			file1.createNewFile();
		}
		FileWriter output = new FileWriter(file1);
		String bbb =sss.toString();
		output.write(bbb);
		output.close();
		FileReader fileReader2 = new FileReader(file1);
		int len1 = 0;
		char[] ccc = new char[1024];
		StringBuffer ss = new StringBuffer();
		while((len = fileReader2.read(ccc))!=-1){
			ss.append(new String(ccc,0,len));
		}
	}
}
