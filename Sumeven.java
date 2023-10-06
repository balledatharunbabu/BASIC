package basic;
import java.util.*;
public class Sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//for(int i=2;i<=x;i++) {
			//if(i%2==0) {
				//System.out.print(i+" ");
		//	}
		//}
		int k=2;
		
		//while(x>k) {
			//if(k%2==0) {
				//System.out.println(k);			
			//}
		//	k=k+1;
			
			
		//}
		do {
			if(k%2==0) 
			{
				System.out.println(k);
			}
			k++;
		}
		while(x>k) ;
		
	}

}
