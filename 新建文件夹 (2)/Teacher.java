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
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+sex);
	}
	
}