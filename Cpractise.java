package basic;
import java.util.*;
public class Cpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		for(int i:arr) {
			System.out.println(i);
		}
		Iterator i=arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator l=arr.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		arr.forEach((n)->System.out.println(n));
	}
}
