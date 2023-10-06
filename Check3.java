package basic;
import java.util.*;
public class Check3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x%3==0 && x%5==0) {
			System.out.println("dividible");
		}
		else {
			System.out.println("not divisible");
		}
		

	}

}
