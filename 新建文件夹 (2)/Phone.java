public class Phone
{
	String name;
	String age;
	int sex;
	public Phone(String name,String age,int sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void say(){
		System.out.println("Ʒ��:"+name);
		System.out.println("ϵ��:"+age);
		System.out.println("�۸�:"+sex);
	}
}