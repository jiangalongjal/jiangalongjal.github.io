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
		System.out.println("产品名称:"+name);
		System.out.println("产品货架:"+sock);
		System.out.println("产品销量:"+volume);
	}

}