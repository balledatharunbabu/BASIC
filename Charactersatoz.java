package basic;

public class Charactersatoz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int c=0;
		while(c<20) {
			int r;
			int a=n;
			int temp=a;
			int sum=0;
			String s=Integer.toString(a);
			int l=s.length();

			while(a>0) {
				r=a%10;
				sum=sum+(int)Math.pow(a, l);
				a=a/10;
			}
			if(sum==n) {
				c=c+1;
				System.out.println(sum);
			}
			n++;
		}

	}

}

