package basic;
import java.util.*;
public class Lucky2 {
	static boolean lucky(int x,int c) {
		if(x%c==0) {
			return false;
		}
		if(x<c) {
			return true;
		}
		return lucky(x-(x/c),c+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(lucky(x,2));
	}

}
