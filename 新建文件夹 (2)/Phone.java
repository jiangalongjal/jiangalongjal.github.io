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
		System.out.println("品牌:"+name);
		System.out.println("系列:"+age);
		System.out.println("价格:"+sex);
	}
}