import java.util.Scanner;
public class Tuozhan{
	public static void main(String[] args){
		int jia,jian,cheng,chu;
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		jia=a+b;
		jian=a-b;
		cheng=a*b;
		chu=a/b;
		System.out.println("������Ҫ�ļ���ķ�ʽ��1Ϊ�ӷ���2Ϊ������3Ϊ�˷���4Ϊ����");
		int c=sc.nextInt();
		switch(c){
			case 1:System.out.println("��Ϊ"+jia);break;
			case 2:System.out.println("��Ϊ"+jian);break;
			case 3:System.out.println("��Ϊ"+cheng);break;
			case 4:System.out.println("��Ϊ"+chu);break;
		}


	}
	
}