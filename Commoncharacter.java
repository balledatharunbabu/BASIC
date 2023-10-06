package basic;
import java.util.*;
public class Commoncharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="thrarun rarhi ahello";
		String[]s1=s.split(" ");
		String m="";
		String s2=s1[0];
		String s3=s1[1];
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<s3.length();j++){
				if(s2.charAt(i)==s3.charAt(j)) {
					m=m+s2.charAt(i);
					//j++;
				}
			}
		}
		System.out.println(m);
		char ch[]=m.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]) {
					c=c+1;
					ch[j]='$';
				}
			}
			if(ch[i]!='$') {
				System.out.print(ch[i]);
			}
		}
		
		
	}
}


