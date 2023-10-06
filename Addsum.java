package basic;
import java.util.Arrays;
import java.util.Scanner;

public class Addsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=10;
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			int x=s.nextInt();
			a[i]=x;
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
