package string;

public class ConvertUpperCaseStringToLowerCase {

	public static void main(String[] args) {
		
		String s= "hello i am abhishek chauhan";
		
		// first we convert string to char array because string object is immutable object so we directly do not perform action on it
		 char[] chars = s.toCharArray();
		 
		 for(int i=0; i<s.length(); i++) {
			 if(chars[i]>='a' && chars[i]<='z') {
				 chars[i]=(char) (chars[i]-32);
				 
			 }
		 }
		 s= new String(chars);
		 System.out.println(s);
		
		

	}

}
