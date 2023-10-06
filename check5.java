package basic;
import java.util.*;

public class check5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c>=65 && c<=90) {
			System.out.println("upper");
		}
		else if(c>=97 && c<=122) {
			System.out.println("lower");
		}
		else if(c>=48 && c<=57){
			System.out.println("Number");
		}
		else {
			System.out.println("symbol");
		}
	}
}
