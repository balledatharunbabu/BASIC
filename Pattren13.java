package basic;

public class Pattren13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print("  ");
			}
			for(int l=i;l!=0;l--) {
				System.out.print(l+" ");
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
