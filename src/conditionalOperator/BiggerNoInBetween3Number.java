package conditionalOperator;

import java.util.Scanner;

public class BiggerNoInBetween3Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first no");
		int a=sc.nextInt();
		
		System.out.println("enter second no");
		int b=sc.nextInt();
		
		System.out.println("enter third no");
		int c=sc.nextInt();
		
		int big=(a>b)?a:b;
		int result= big>c? big:c;
		System.out.println(result);
	}

}
