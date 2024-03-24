package basicProgram;

import java.util.Scanner;

public class GivenInputIsVowelOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any input in lowercase");
		char input=sc.next().charAt(0);
		
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'){
			System.out.println("enter input is vowel:" + input);
			
		}
		else {
			System.out.println("enter input is not vowel");
		}
		

	}

}
