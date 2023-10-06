package basic;
import java.lang.Math;
import java.util.*;

public class bIG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int r;
		int l=0;
		while(x>0) {
			r=x%10;
			l=Math.max(r,l);
			x=x/10;
		}
		System.out.println(l);	
	}
}
