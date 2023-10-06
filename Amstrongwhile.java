package basic;

public class Amstrongwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;int c=0;
		while(c<200) {
			int sum=0;
			int temp=n;
			while(n>0) {
				String s=Integer.toString(n);
				int x=s.length();
				int r;
				r=n%10;
				sum=(int)(sum+Math.pow(r,x));
			}
			if(temp==sum) {
				System.out.println(temp);
				c=c+1;
			}
			n=n+1;
		}
	}
}
