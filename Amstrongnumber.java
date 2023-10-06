package basic;
import java .util.*;
import java.lang.Math;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		String y=Integer.toString(x);
		int l=y.length();
		int temp=x;
		int r;
		int sum=0;
		while(x>0) {
			r=x%10;
			sum=(int) (sum+Math.pow(r,l));
			x=x/10;
		}
	if(temp==sum) {
		System.out.println("amstrong");
	}
	else {
		System.out.println("not");
	}
		

	}

}
