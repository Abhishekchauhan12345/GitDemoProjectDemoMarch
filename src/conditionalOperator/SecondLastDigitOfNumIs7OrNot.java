package conditionalOperator;

import java.util.Scanner;

public class SecondLastDigitOfNumIs7OrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no");
		int x=sc.nextInt();
		int y=x/10;
		String result=y/10==7?"second last digit is 7":"second last digit is not 7";
		System.out.println(result);
		

	}

}
