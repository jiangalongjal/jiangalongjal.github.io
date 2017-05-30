public class runnian{
public static void main(String[] args){
	int q=2000;
	while(q<=2500){
		if ((q%4==0&&q%100!=0)||q%400==0){
			System.out.print(q+",");
}q++;
}
}
}