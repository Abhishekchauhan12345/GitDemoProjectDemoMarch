package programFolder;

import java.util.Scanner;

public class CheckNumIsPositiveOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num you want to check it is positive or not");
		int num=sc.nextInt();
		
		if(num>=0) {
			System.out.println("entered number is positive");
		}
		else {
			System.out.println("enter number is negative");
		}


	}

}
