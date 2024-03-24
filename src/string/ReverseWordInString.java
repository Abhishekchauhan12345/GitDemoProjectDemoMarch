package string;

public class ReverseWordInString {

	public static void main(String[] args) {
		String s="hello i am abhishek chauhan";
		String revoriginal="";
		String[] a =s.split(" ");
		
		for(String str: a) {
			String revword="";
			
			for(int i=str.length()-1; i>=0; i--) {
				revword=revword+str.charAt(i);
				
			}
			revoriginal=revoriginal+revword+" ";
			
		}
		System.out.println(revoriginal);
		
		
		
		

	}

}
