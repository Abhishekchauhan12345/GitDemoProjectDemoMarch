package string;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String s= "Abhishek bhai";
		int len=s.length();
		System.out.println(len);
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev= rev + s.charAt(i);
			
		}
		System.out.print(rev);
		
		
	}
}
