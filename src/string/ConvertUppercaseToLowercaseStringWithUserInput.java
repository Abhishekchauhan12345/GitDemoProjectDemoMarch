package string;
import java.util.*;
public class ConvertUppercaseToLowercaseStringWithUserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any string");
		String s=sc.nextLine();
		char[] chars=s.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i]>='A'&& chars[i]<='Z') {
				chars[i]=(char) (chars[i]+32);
			}
		}
		s= new String(chars);
		System.out.println(s);

	}

}
