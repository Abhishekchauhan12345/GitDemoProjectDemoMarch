package basicProgram;

import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		System.out.println("This is for checking enter character is alphabet or not");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any details to check it is alphabet or number");
		char alph=sc.next().charAt(0);
		
		if(alph>='A' && alph<='Z' || alph>='a' && alph<='z') {
			System.out.println("It is alphbet");
		}
		else {
			System.out.println("It is number");
		}
	}
	}


