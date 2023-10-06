package basic;
import java.util.*;
import java.lang.Math;

public class Alternatesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int sum=0;
		int sum1=0;
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		ArrayList<Integer> a=new ArrayList();
		while(x>0) {
			r=x%10;
			a.add(r);
			x=x/10;
		}
		Collections.reverse(a);
		System.out.println(a);
		for(int i=0;i<a.size();i++) {
			if(i%2==0) {
				sum=sum+a.get(i);
			}
			else {
				sum1=sum1+a.get(i);
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		
	}	

}
