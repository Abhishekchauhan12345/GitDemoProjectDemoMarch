package importantProgram2;

import java.util.Scanner;

public class PrintEvenDigitInANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		while(num>0) {
			int digit=num%10;
			
			if(digit%2==0) {
				System.out.print(digit);
			}
			num=num/10;
		}
			}
		}

	


