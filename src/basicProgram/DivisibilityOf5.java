package basicProgram;

import java.util.Scanner;

public class DivisibilityOf5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		if((num%10==5 )||( num%10==0)) {
			System.out.println("enter number is divisible by 5");
		}
		else {
			System.out.println("number is not divisible by 5");
		}

	}

}
