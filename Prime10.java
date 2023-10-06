package basic;

public class Prime10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int c=0;
		for(int i=1;i<n;i++) {
			c=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==1) {
				System.out.println(i);
			}
		}

	}

}
