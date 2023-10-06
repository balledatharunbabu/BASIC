package basic;
class Fact{
	int factorial(int i) {
		if (i==0){
			return 1;
		}
		else {
			return i*factorial(i-1);
		}
	}
}
public class Factrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact o1=new Fact();
		System.out.println(o1.factorial(5));

	}

}
