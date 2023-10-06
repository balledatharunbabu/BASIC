package basic;
import java.util.*;

public class Counthashmap {
	static void count(int n) {
		String s=Integer.toString(n);
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<=9;i++) {
			h.put(i, 0);
		}
		for(int i=0;i<s.length();i++) {
			int a=Character.getNumericValue(s.charAt(i));
			h.put(a,h.get(a)+1);	
		}
		for(int i=0;i<10;i++) {
			if(h.get(i)==0) {
				continue;
			}
			else{
				System.out.println(i+" "+h.get(i));
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=55125;
		count(n);

	}

}
