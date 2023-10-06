package basic;
import java.util.*;
public class Spellthewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//ArrayList<Integer> arr=new ArrayList<>();
		String st=Integer.toString(x);
		HashMap<Integer,String> h=new HashMap<>();
		h.put(0, "ZERO");
		h.put(1,"ONE");
		h.put(2,"TWO");
		h.put(3,"THREE");
		h.put(4,"FOUR");
		h.put(5,"FIVE");
		h.put(6,"SIX");
		h.put(7,"SEVEN");
		h.put(8,"EIGHT");
		h.put(9,"NINE");
		h.put(10,"TEN");
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			System.out.println(c+h.get(Character.getNumericValue(c)));
		}
	}

}
