package string;

public class CountNoOfWordsInAString {

	public static void main(String[] args) {
		String s="hello my name is abhishek chauhan";
		int count=0;
		String[] sp=s.split(" ");
		
		for(String str:sp) {
			
			count++;
		}
		System.out.println(count);

	}

}
