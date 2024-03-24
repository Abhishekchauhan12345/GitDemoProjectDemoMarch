package basicProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any year to check it is leap year or not");
		int leap=sc.nextInt();
		
		if((leap%4==0 && leap%100!=0) ||( leap%400==0)) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not a leap year");
		}
	}

}
