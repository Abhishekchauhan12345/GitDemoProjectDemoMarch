package importantProgram3;

import java.util.Scanner;

public class SumOfSquareOfEachEvenDigitInANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int square=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				int square1=rem*rem;
				square=square+square1;
				//System.out.println(square);
				
			}
			num=num/10;
		}
		System.out.println(square);

	}

}
