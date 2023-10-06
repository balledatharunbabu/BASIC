package basic;
import java.util.*;
import java.lang.Math;

public class Read10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList();;

		
		for(int i=0;i<3;i++) 
		{
			
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			a.add(x);	
		}
		int s=0;
		for(int i=0;i<a.size();i++) 
		{
			s=s+i;
		}
		System.out.println(s/3);
		System.out.println(Collections.max(a));
	}			
}
