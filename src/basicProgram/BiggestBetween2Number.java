package basicProgram;

import java.util.Scanner;

public class BiggestBetween2Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		
		System.out.println("enter second number");
		int y=sc.nextInt();
		
		int big=x>y?x:y;
		System.out.println("biggest number is:"+ big);

	}

}
