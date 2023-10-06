package basic;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;int i;int c=0;int sum=0;
		while(c<10) {
			for(i=2;i<n;i++) {
				if(n%i==0) 
				{
					//System.out.println("not");
					break;
				}
			}
			if(n==i) {
				sum=sum+i;
				c=c+1;
			}
			n=n+1;
			
		}
		System.out.println(sum);
		
	}

}
