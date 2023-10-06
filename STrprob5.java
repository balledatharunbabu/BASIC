package basic;

public class STrprob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tharun is tall and bad";
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0) {
				for(int j=0;j<s1[i].length();j++) {
					if(s1[i].charAt(j)!='a'&&s1[i].charAt(j)!='e'&&s1[i].charAt(j)!='i'&&s1[i].charAt(j)!='o'&&s1[i].charAt(j)!='u') {
						s2=s2+s1[i].charAt(j);
					}
				}
				s2=s2+" ";
			}
			else {
				for(int j=0;j<s1[i].length();j++) {
					if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||s1[i].charAt(j)=='o'||s1[i].charAt(j)=='u') {
						s2=s2+s1[i].charAt(j);
					}
				}
				s2=s2+" ";
			}
		}
		System.out.println(s2);
		}

}
