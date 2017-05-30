public class sushu{
	public static void main(String[] args){
		for(int a=1;a<100;a++){
			int m=0;
			for(int b=2;b<a;b++){
				if(a%b==0){
					m=1;
					}
				
			}if(m==0){
					System.out.print(a+"\t");
				}
		}
	}
}