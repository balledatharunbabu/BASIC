package basic;

public class Numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int r=0;
		int s=0;
		int temp =n;
		int c=0;
		while(n>0) {
			r=n%10;
			c=c+1;
			
			
			n=n/10;
			s=s*10+r;
			
		}
		System.out.println(c);
		if(temp==s) {
			System.out.println("palandrome");
		}

	}

}
