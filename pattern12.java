package basic;

public class pattern12 {
	int fact(int m) {
		if(m==1 || m==0) {
			return 1;
		}else {
			return m*fact(m-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern12 o1=new pattern12();
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" "+o1.fact(i)/o1.fact(i-j)*o1.fact(j));
			}
			System.out.println();
		}
		

	}

}
