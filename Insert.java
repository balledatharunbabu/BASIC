package basic;
import java.util.*;
import java.util.Arrays;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int p=s.nextInt();
		int number=10;
		for(int i=0;i<size;i++) {
			int x=s.nextInt();
			arr[i]=x;	
		}
	
		for(int i=size-1;i>=p;i--) {
			arr[i+1]=arr[i];
		}
		arr[p]=number;
		System.out.println(Arrays.toString(arr));
	}

}
