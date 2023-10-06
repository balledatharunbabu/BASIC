package basic;
import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<>();
		int[] a= {0,0,2,1,1,5};
		for(int i=0;i<6;i++) {
			h.put(i,0);
		}
		for(int i=0;i<a.length;i++) {
			
			h.put(a[i],h.get(a[i])+1); 
		}
		System.out.println(h);
		Set s=h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		
	}

}
