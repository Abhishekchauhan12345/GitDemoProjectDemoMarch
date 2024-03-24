package basicProgram;

import java.util.Scanner;

public class GivenInputIsAlphabetOrDigitOrSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any input");
		char input=sc.next().charAt(0);
		
		if((input>='A' && input<='Z')||(input>='a'&&input<='z')){
			System.out.println("input is alphabet:"+ input);
		}
		else if(input=='!'||input=='@' ||input=='#' || input=='$' ||input=='%'||input=='^'||input=='*' ) {
			System.out.println("input is special character:"+ input);
		}
		else {
			System.out.println("input is digit:"+ input);
		}
		System.out.println("program ends");
		
		
	}

}
