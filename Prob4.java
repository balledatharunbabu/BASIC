package basic;
import java.util.*;
public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Tharun is tall";
		String[] s1=s.split(" ");
		ArrayList<String> arr=new ArrayList<String>();
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		for(int i=0;i<s1.length;i++) {
			arr.add(s1[i]);
			h.put(s1[i],s1[i].length());
		}
		int x=(int)Collections.max(h.values());
		for(Map.Entry m1:h.entrySet()){
			int y=(int)m1.getValue();
			if(y==x) {
				System.out.println(m1.getKey());
			}
		}
	}
}
