public class shuixianhuashu{
public static void main(String[] args){
int a=100,b,c,d,sum;
while(a<1000){
b=a/100;
c=a/10%10;
d=a%10;
		if(a==(b*b*b+c*c*c+d*d*d)){
		System.out.print(a+",");
		}
		a++;
	}
}
}
