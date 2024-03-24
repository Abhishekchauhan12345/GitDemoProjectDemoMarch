package methodProgram;

import java.util.Scanner;

public class ReturnSquareOfTheNumberFromMehtod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number you want to square");
		int num=sc.nextInt();
		
		System.out.println("square of "+num+" is: "+ square(num));
		

	}
	public static int square(int n) {
		int square;
		
		square=n*n;
		return square;
	}

}
