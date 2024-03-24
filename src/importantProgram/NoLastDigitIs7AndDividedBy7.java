package importantProgram;

import java.util.Scanner;

public class NoLastDigitIs7AndDividedBy7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		if(num%7==0 && num%10==7) {
			System.out.println("number is divided by 7 and last digit is also 7");
		}
		else {
			System.out.println("number is either not divided by 7 or last digit is not 7");
		}

	}

}
