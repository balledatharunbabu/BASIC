package basic;
import java.util.Arrays;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,1,3,2,3};
		//Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				int c=1;
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					c=c+1;
				}
				else {
					break;
				}
				System.out.println(a[i]+" "+c);
				i=i+(c-1);
			}
			
		}

}
}
