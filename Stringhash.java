package basic;
import java.util.*;
public class Stringhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="thababbbb";
		
		ArrayList<Character> arr=new ArrayList<Character>();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			arr.add(s.charAt(i));
		}
		for(int i=0;i<arr.size();i++) {
			h.put(arr.get(i),0);
		}
		for(int i=0;i<arr.size();i++) {
			h.put(arr.get(i),h.get(arr.get(i))+1);
		}
		for(Map.Entry k:h.entrySet()) {
			System.out.println(k.getKey()+" "+k.getValue());
		}
	}

}