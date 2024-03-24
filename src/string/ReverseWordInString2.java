package string;

public class ReverseWordInString2 {

	public static void main(String[] args) {
		String s="PRINCE IS GOOD SINGER";
		
		String[] sp=s.split(" ");
	//	String revword="";
		String revoriginal="";
		
		for(String str: sp) {
			
			String revword="";
			for(int i=str.length()-1; i>=0; i--) {
				revword=revword+str.charAt(i);
			}
			revoriginal=revoriginal+revword+" ";
			
			
		}
		System.out.println(revoriginal);

	}

}
