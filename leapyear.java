package basic;
import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x%400==0 || (x%4==0 && x%100!=0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
}
