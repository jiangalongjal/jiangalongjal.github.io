public class Student
{	//����
	String name;
	//����
	int age;
	//�Ա�
	String sex;
	//�ɼ�
	double value;
	public Student(String name,int age,String sex,double value){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.value=value;
	}
	public void say(){
		System.out.println("�ҽ�"+name+"����"+age+","+"�Ա�"+sex+"�ҵĳɼ���"+value+"��");
	}
}