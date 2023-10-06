package basic;
import java.util.*;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a=new ArrayList();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int r;
		while(x>0) {
			r=x%10;
			a.add(r);
			x=x/10;		
		}
		Collections.reverse(a);
		System.out.println(a);
		
			
			}
		}

