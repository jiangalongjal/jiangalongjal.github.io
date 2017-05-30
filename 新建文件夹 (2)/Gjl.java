import java.util.Arrays;
public class Gjl
{
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		int[] a2={1,2,3,5,6,7};
		System.out.println("a数组和a2数组是否相等："+Arrays.equals(a,a2));
		Arrays.sort(a);
		int b=Arrays.binarySearch(a,5);
		System.out.println(b);

	}
}