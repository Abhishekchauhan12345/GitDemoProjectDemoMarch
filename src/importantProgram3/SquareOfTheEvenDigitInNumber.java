package importantProgram3;

import java.util.Scanner;

public class SquareOfTheEvenDigitInNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int square;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				square=rem*rem;
				System.out.println("square of "+ rem+" is:"+ square);
			}
			num=num/10;
		}
		

	}

}
