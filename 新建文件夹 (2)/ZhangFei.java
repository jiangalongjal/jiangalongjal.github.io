   public class ZhangFei {
	//名字
	String name;
	//年龄
	int age;
	//成绩
	double value;
	public String getName() {
	return "张飞";
	}
	public int getAge() {
	return 20;
	}
	public double getValue() {
	return 100;
	}
	public static void main(String[] args){
	ZhangFei get=new ZhangFei();
	System.out.println("名字是: "+get.getName());
	System.out.println("年龄为: "+get.getAge());
	System.out.println("成绩为: "+get.getValue());
	}
}