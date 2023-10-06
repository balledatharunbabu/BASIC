package basic;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int a=5;
		int b=10;
		
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);	
			
		}

	}

}
