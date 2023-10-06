package basic;
import java.util.*;
public class stringzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="the hello hi tharun hi hi";
		String s1="hi hello hi hi";
		 String s2[]=s.split(" "); 
		 String s3[]=s1.split(" ");
String u="";// for(int
		 //* i=0;i<s2.length;i++) { int c=0; for(int j=0;j<s3.length;j++) {
		 //* if(s2[i].equals(s3[j])) { c=c+1; u=u+s2[i];
		 //* 
		//* } } } System.out.println(u);
		// */
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> arr1=new ArrayList<String>();
		for(String i:s2) {
			arr.add(i);
		}
		for(String i:s3) {
			arr1.add(i);
		}
		System.out.println(arr);
		System.out.println(arr1);
		arr.retainAll(arr1);
		if(arr.size()>arr1.size()) {
			System.out.println(arr1);
		}
	}

}
