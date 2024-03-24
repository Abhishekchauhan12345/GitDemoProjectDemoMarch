package basicProgram;

import java.util.Scanner;

public class Check2ndLastDigitIs6OrNot {

	public static void main(String[] args) {
		
		System.out.println("This is checking 2nd last of any digit is 6 or not");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		int x=num/10;
		if(x%10==6) {
			System.out.println("Second last digit of entered no is 6");
		}
		else {
			System.out.println("second last digit of entered no is not 6");
		}
		
	}

}
