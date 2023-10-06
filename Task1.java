package basic;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,10,5};
	    Scanner s=new Scanner(System.in);
	    int Sum=s.nextInt();
	    for(int i=0;i<a.length;i++){
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]+a[j]==Sum){
	                System.out.println(i+1+" "+(j+1));
	            }
	        }
	    }
	

	}

}
