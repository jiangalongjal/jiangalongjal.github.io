public class Student
{
	String name;
	char sex;
	int age;
	public Student(String name,char sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void say(){
		System.out.println("姓名："+name);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
	} 
}