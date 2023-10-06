package basic;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=100;
		int c=90;
		int res=(a>b &&a>c)?a:(b>c)?b:c;
		System.out.println(res);
	}
}