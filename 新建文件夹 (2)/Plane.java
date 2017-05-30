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
		System.out.println("型号:"+name);
		System.out.println("产地:"+age);
		System.out.println("价格:"+sex);
	}
}