package conditionalOperator;

import java.util.Scanner;

public class LastDigit3OrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no");
		int x=sc.nextInt();
		String result= x%10==3?"last digit is 3":"last digit not 3";
		System.out.println(result);

	}

}
