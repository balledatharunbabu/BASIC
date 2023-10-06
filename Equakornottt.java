package basic;

public class Equakornottt {
	static String check(int n) {
		int r;
		r=n%10;
		while(n>0) {
			int cr=n%10;
			n=n/10;
			if(cr!=r) {
				return "no";
			}
		
		}
		
			return "yes";	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12344;
		System.out.println(check(n));
	}

}
