package string;

public class PrintCharacterWithoutTakingSpaceBetweenString {

	public static void main(String[] args) {
		String s= "Hello my name is abhishek Chauhan";
		int count=0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=' ') {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
