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
		System.out.println("������"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
	} 
}