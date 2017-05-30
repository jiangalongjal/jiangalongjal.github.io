import java.util.Scanner;
public class SubbleSort{
	public static void main(String[] arge){
	int c,b,emp,j;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入十个数排序：");
		for(j=0;j<10;j++){
			 a[j]=sc.nextInt();
		}
		//冒泡排序循环
		for(c=0;c<9;c++){
			for(b=0;b<9-c;b++){
				if(a[b]>a[b+1]){
					emp=a[b];
					a[b]=a[b+1];
					a[b+1]=emp;
				}	
			}
		}
		//循环输出
		for(j=0;j<10;j++){
				System.out.print(a[j]+",");
		}
	}
}