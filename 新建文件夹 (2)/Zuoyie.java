import java.util.Scanner;
public class Zuoyie{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int sca=sc.nextInt();
		System.out.println("������ڶ������֣�");
		int scan=sc.nextInt();
		System.out.println(sca+"+"+scan+"="+(sca+scan));
		System.out.println(sca+"-"+scan+"="+(sca-scan));
		System.out.println(sca+"*"+scan+"="+(sca*scan));
		System.out.println(sca+"/"+scan+"="+(sca/scan));
	}
}