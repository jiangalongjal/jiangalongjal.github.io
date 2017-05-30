public class Student
{	//姓名
	String name;
	//年龄
	int age;
	//性别
	String sex;
	//成绩
	double value;
	public Student(String name,int age,String sex,double value){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.value=value;
	}
	public void say(){
		System.out.println("我叫"+name+"今年"+age+","+"性别："+sex+"我的成绩是"+value+"分");
	}
}