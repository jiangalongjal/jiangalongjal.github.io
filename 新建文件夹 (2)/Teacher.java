public class Teacher
{
	String name;
	int age;
	String sex;
	public Teacher(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void say(){
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("�Ա�:"+sex);
	}
	
}