package basic;
import java.util.*;
import java.util.Map.Entry;
public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		String s4="";
		String s5="";
		ArrayList<String> arr=new ArrayList<String>();
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		for(String i:s2) {
			arr.add(i);
			h.put(i,0);
		}
		for(int i=0;i<arr.size();i++) {
			h.put(arr.get(i),h.get(arr.get(i))+1);
		}
		for(Map.Entry m:h.entrySet()) {
			if((int)m.getValue()==1) {
				System.out.print(m.getKey()+" ");
			}
		}
		
	}
}
