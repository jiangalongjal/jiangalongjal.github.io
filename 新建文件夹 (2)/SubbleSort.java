import java.util.Scanner;
public class SubbleSort{
	public static void main(String[] arge){
	int c,b,emp,j;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("������ʮ��������");
		for(j=0;j<10;j++){
			 a[j]=sc.nextInt();
		}
		//ð������ѭ��
		for(c=0;c<9;c++){
			for(b=0;b<9-c;b++){
				if(a[b]>a[b+1]){
					emp=a[b];
					a[b]=a[b+1];
					a[b+1]=emp;
				}	
			}
		}
		//ѭ�����
		for(j=0;j<10;j++){
				System.out.print(a[j]+",");
		}
	}
}