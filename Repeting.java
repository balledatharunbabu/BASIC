package basic;
import java.util.*;
public class Repeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,10,10,10,4};
		//2 is missing,3 repeating
		ArrayList<Integer> arr=new ArrayList();
		for(int i=0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int x=Collections.max(arr);
		System.out.println(arr);
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=1;i<=x;i++) {
			h.put(i,0);
		}
		for(int i=0;i<a.length;i++) {
			h.put(a[i],h.get(a[i])+1);
		for(int j=1;j<=x;i++) {
			if(h.get(j)==0) {
				System.out.println(j+ " "+"is Missing");
			}
		}
		System.out.println(h);
		int z=Collections.max(h.values());
		System.out.println(z);
	}
		}
}

