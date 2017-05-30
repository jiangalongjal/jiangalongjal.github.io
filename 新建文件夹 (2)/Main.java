public class Main
{
	public static void main(String[] arge){
		Student[] students=new Student[1];
		Student student1=new Student("yangjing",19,"Ů",88);
		students[0]=student1;
		students[0].say(); 
	}
}