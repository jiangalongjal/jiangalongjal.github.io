   public class ZhangFei {
	//����
	String name;
	//����
	int age;
	//�ɼ�
	double value;
	public String getName() {
	return "�ŷ�";
	}
	public int getAge() {
	return 20;
	}
	public double getValue() {
	return 100;
	}
	public static void main(String[] args){
	ZhangFei get=new ZhangFei();
	System.out.println("������: "+get.getName());
	System.out.println("����Ϊ: "+get.getAge());
	System.out.println("�ɼ�Ϊ: "+get.getValue());
	}
}