package basic;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		ArrayList<Integer> a=new ArrayList();
		while(x>0) {
			int r=x%10;
			a.add(r);
			x=x/10;
		}
		Collections.sort(a);
		System.out.println(a);
		
}
}