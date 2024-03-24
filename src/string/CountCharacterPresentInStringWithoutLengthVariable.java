package string;

public class CountCharacterPresentInStringWithoutLengthVariable {

	public static void main(String[] args) {
		
		String s= "Hello my name is abhishek chauhan";
		
		// find length using length variable
		System.out.println(s.length());
		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
				count++;		
					
		}
		System.out.println("number of character present in string is:" +count);

	}

}
