import java.util.Scanner;
public class Tuozhan{
	public static void main(String[] args){
		int jia,jian,cheng,chu;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数");
		int a=sc.nextInt();
		int b=sc.nextInt();
		jia=a+b;
		jian=a-b;
		cheng=a*b;
		chu=a/b;
		System.out.println("输入想要的计算的方式：1为加法，2为减法，3为乘法，4为除法");
		int c=sc.nextInt();
		switch(c){
			case 1:System.out.println("加为"+jia);break;
			case 2:System.out.println("减为"+jian);break;
			case 3:System.out.println("乘为"+cheng);break;
			case 4:System.out.println("除为"+chu);break;
		}


	}
	
}