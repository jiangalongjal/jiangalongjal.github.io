import java.util.Scanner;
public class Main
{	
	static private String name;
	static private char sex;
	static private int age;
	static int i=0;
	static Scanner sc=new Scanner(System.in);
	static Student[] students=new Student[100];
	public static void main(String[] arge){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("请选择你想要的查询结果：");
		System.out.println("增加请选择 1");
		System.out.println("修改请选择 2");
		System.out.println("查询请选择 3");
		System.out.println("删除请选择 4");
		System.out.println("退出请选择 5");
		int a=sc.nextInt();
		switch(a){
			case 1:addStudent();break;
			case 2:uppdateStudent();break;
			case 3:selectStudent();break;
			case 4:deleteStudent();break;
			case 5:System.exit(0);break;
		}
	}
	//添加
	public static void addStudent(){
		boolean addfold=true;
		while(addfold){
			System.out.println("请输入学生姓名：");
			String name=sc.next();
			System.out.println("请输入学生性别：");
			char sex=sc.next().charAt(0);
			System.out.println("请输入学生年龄：");
			int age=sc.nextInt();
			Student student=new Student(name,sex,age);
			students[i]=student;
			i++;
			System.out.println("完成输入请继续选择：");
			System.out.println("继续输入 1");
			System.out.println("结束输入 2");
			int c=sc.nextInt();
			if(c==1){
				addfold=true;
			}else{
				addfold=false;
			}
		}
		printMenu();
	}
	//修改
	public static void uppdateStudent(){}
	//查询
	public static void selectStudent(){
		boolean uppdatefold=true;
		while(uppdatefold){
			System.out.println("输入你要查询的名字");
			String as=sc.next();
			for(int j=0;j<students.length;j++){
			if(students[j].name.equals(as)){
				students[j].say();
			}else{
				System.out.println("对不起，查无此人");
			}
			System.out.println("是否要继续查询");
			System.out.println("继续查询点击 1");
			System.out.println("退出查询点击 2");
			int cha=sc.nextInt();
			if(cha==1){
				uppdatefold=true;
			}else{
				printMenu();}
			}
		}
		
	}
	//删除
	public static void deleteStudent(){}
	//退出
	public static void exit(){}
}