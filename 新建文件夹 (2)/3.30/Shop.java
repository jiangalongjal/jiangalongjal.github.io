public class Shop
{
	String name;
	char sock;
	int volume;
	public Shop(String name,char sock,int volume){
		this.name=name;
		this.sock=sock;
		this.volume=volume;
	}
	public void say(){
		System.out.println("��Ʒ����:"+name);
		System.out.println("��Ʒ����:"+sock);
		System.out.println("��Ʒ����:"+volume);
	}

}