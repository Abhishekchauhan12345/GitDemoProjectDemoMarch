package importantProgram3;

import java.util.Scanner;

public class PrintPalidromeNumberBetween10_200 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		boolean palidrome = isPalidrome(number);
		
		if(palidrome) {
			System.out.println("enter num "+number+" is palidrome number :" +palidrome);
		}
		else {
			System.out.println("enter num "+ number+" is not palidrome number");
		}
		
		
		}
	public static boolean isPalidrome(int number) {
		int rev=0;
		
		while(number>0) {
			int rem=number%10;
			
			rev=rev*10+rem;
			number=number/10;
		}
		return number==rev;
	}
	}


