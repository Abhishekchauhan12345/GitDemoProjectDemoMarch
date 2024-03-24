package basicProgram;

import java.util.Scanner;

public class GivenAlphabetisUpperOrLowerCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a alphabet");
		
		char alph = sc.next().charAt(0);
		
		if(alph>='A' && alph<='Z') {
			System.out.println("given alphabet is upper case");
			
		}
		else if(alph>='a' && alph<='z'){
			System.out.println("given alphabet is in lower case");
			
		}
		else {
			System.out.println("you entered wrong data please enter character");
		}
		
			System.out.println("program ends");
		

	}

}
