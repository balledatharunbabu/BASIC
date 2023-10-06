package basic;
import java.util.*;
import java.lang.Math;
public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		double sum=0.0;
		for(int i=1;i<=x;i++) {
			sum=sum+1/Math.pow(2, i);
		}
		System.out.println(1+sum);

	}

}
