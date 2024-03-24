package conditionalOperator;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		
		String result=(a>b)?"first no is bigger":"second no is bigger";
		System.out.println(result);
	}

}
