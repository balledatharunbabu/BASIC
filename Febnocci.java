package basic;

public class Febnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		int a=1;int b=1;int s=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(s<=n) {
			s=a+b;
			System.out.print(s+" ");
			a=b;
			b=s;
		}
	}

}
