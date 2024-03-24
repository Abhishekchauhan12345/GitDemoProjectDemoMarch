package basicProgram;

import java.util.Scanner;

public class Check2ndLastDigitIs6OrNotByConditionalOperator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter any number");
		int num=sc.nextInt();
		int x=num/10;
		
		String six=x%10==6?"second last digit is 6":"second last digit is not 6";
		System.out.println(six);

	}

}
