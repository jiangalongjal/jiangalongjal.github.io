public class Plane
{
	String name;
	String age;
	int sex;
	public Plane(String name,String age,int sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void say(){
		System.out.println("�ͺ�:"+name);
		System.out.println("����:"+age);
		System.out.println("�۸�:"+sex);
	}
}