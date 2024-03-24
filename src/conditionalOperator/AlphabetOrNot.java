package conditionalOperator;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any albhabet");
		char c=sc.next().charAt(0);
		String result=(c>='A'&&c<='Z')||(c>='a'&&c<='z')?"enter character is alphabet":"enter character us not albhabet";
		System.out.println(result);
	}
	

}
