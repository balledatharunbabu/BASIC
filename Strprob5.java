package basic;
import java.util.*;
public class Strprob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="the name is is ia im jk";
		String s1[]=s.split(" ");
		int r=0;
		String s2="";
		for(String i:s1) {
			int c=0;
			for(int j=0;j<s1.length;j++) {
				if(i.equals(s1[j])) {
					c=c+1;
				}
			}
			if(c>r) {
				r=c;
				s2=i;
			}
		}
		System.out.println(r);
		for(String i:s1) {
			if(s2.length()==i.length()) {
				System.out.print(i+" ");
			}
		}
	}
}
