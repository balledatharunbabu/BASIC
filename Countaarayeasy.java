package basic;
import java.util.Arrays;
public class Countaarayeasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,2,1,2,9,9};
		Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int c=1;
            for(int j=i+1;j<arr.length;j++)
            {
               
                    if(arr[i]==arr[j]){
                        c=c+1;
                    }
                    else{
                        break;
                    }
            }
            System.out.println(arr[i]+"."+c);
            i=i+(c-1);
        }
	}
}