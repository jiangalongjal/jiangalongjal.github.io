import java.util.Scanner;
public class Zuoyie{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int sca=sc.nextInt();
		System.out.println("请输入第二个数字：");
		int scan=sc.nextInt();
		System.out.println(sca+"+"+scan+"="+(sca+scan));
		System.out.println(sca+"-"+scan+"="+(sca-scan));
		System.out.println(sca+"*"+scan+"="+(sca*scan));
		System.out.println(sca+"/"+scan+"="+(sca/scan));
	}
}