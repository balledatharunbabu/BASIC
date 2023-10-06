package basic;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		
		int n1=1;
		while(c<100) {
			int s=0;
			for(int i=1;i<n1;i++) {
				if(n1%i==0) {
					s=s+i;
				}
			}
			if(s==n1) {
				System.out.println(n1);
				c=c+1;
			}
			n1=n1+1;
			
		}
	}

}
