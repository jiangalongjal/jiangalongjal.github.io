public class wanshu{
public static void main(String[] args){
int a=1,b,c;
while(a<1000){
c=0;
b=1;
while(b<a){
if(a%b==0){
c=c+b;}
b++;}
if(c==a){
System.out.print(a+",");
}a++;}
}
}
