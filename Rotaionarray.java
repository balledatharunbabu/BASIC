package basic;
import java.util.*;
import java.util.Arrays;
public class Rotaionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		for(int i=0;i<s1;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
