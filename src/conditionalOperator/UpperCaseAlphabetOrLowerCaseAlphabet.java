package conditionalOperator;

import java.util.Scanner;

public class UpperCaseAlphabetOrLowerCaseAlphabet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any character");
		char x=sc.next().charAt(0);
		String result = (x>='A' && x<='Z')?"it is upper case":"it is lower case";
		System.out.println(result);
		
				
	}

}
