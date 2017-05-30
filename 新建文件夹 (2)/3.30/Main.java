import java.util.*;
public class Main{
	static private int i=0;
	static private String name;
	static private char sock;
	static private int volume;
	static Shop[] shops=new Shop[100];
	static Scanner sca=new Scanner(System.in);
	public static void main(String[] arge){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("请选择你想进行的操作");
		System.out.println("添加产品种类请选择 1");
		System.out.println("修改产品信息请选择 2");
		System.out.println("查看产品信息请选择 3");
		System.out.println("删除产品信息请选择 4");
		System.out.println("操作完成请选择 5");
		int a=sca.nextInt();
		switch(a){
			case 1:addShop();break;
			case 2:uppdateShop();break;
			case 3:selectShop();break;
			case 4:deleteShop();break;
			case 5:System.exit(0);break;
		}
	}
	//添加
	public static void addShop(){
		boolean flodadd=true;
		while(flodadd){
			System.out.println("商品名称：");
			String name=sca.next();
			System.out.println("商品货架：");
			char sock=sca.next().charAt(0);
			System.out.println("商品销量：");
			int volume=sca.nextInt();
			Shop shop=new Shop(name,sock,volume);
			shops[i]=shop;
			i++;
			System.out.println("是否还要继续录入信息");
			System.out.println("继续录入请选择 1");
			System.out.println("返回菜单请选择 2");
			int b=sca.nextInt();
			if(b==1){
				flodadd=true;
			}else{
				flodadd=false;
			}
			
		}printMenu();
	}
	//修改
	public static void uppdateShop(){};
	//查看
	public static void selectShop(){
		boolean foldselect=true;
		while(foldselect){
			System.out.println("输入你想要查询的商品名称：");
			String c=sca.next();
			for(int j=0;j<shops.length;j++){
				if(shops[j].name.equals(c)){
					shops[j].say();
				}else{
					System.out.println("对不起，暂无此商品信息");
				}
				System.out.println("是否要继续查询");
				System.out.println("继续查询 1");
				System.out.println("停止查询 2");
				int d=sca.nextInt();
				if(d==1){
					foldselect=true;
				}else{
					foldselect=false;
				}
			}printMenu();
		}
	};
	//删除
	public static void deleteShop(){};
	//退出
	public static void exit(){};
}