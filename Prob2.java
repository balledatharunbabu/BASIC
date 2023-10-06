package basic;
import java.lang.Math;
public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String s="tharun is tall fivegh";
		    String s5="";
		    String s6="";
		   String[] ch=s.split(" ");
		   for(String s1:ch){
		       s5=s5+s1;
		       
		   }
		   System.out.println(s5);
		   double x=Math.sqrt(s5.length());
		   int y=(int)Math.floor(x);
		   int z=(int)Math.ceil(x);
		   int count=1;
		   for(int i=0;i<s5.length();i++) {
			   System.out.print(s5.charAt(i));
			   if(count==4) {
				   System.out.println();
				   count=0;
			   }
			   count=count+1; 
		   }
		  }   
	}
