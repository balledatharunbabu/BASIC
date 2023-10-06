package basic;
import java.util.Arrays;
import java.util.*;

public class Countarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a= {6,1,2,3,7,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max=0;
		for(int i=0;i<a.length;i++) {
			int c=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						c=c+1;
					}
					else {
						break;
					}
				}
				System.out.println(a[i]+" "+c);
				if(c>max) {
					max=c;
				}
				i=i+c-1;
			}
		System.out.println("maximum"+" "+max);
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c=c+1;
				}
				else {
					break;
				}
			}
			if(c==max) {
				System.out.println(a[i]);
			}
			i=i+c-1;
			
		}
		
		}
	
	}

