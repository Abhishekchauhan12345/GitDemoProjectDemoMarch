package basicProgram;

import java.util.Scanner;

public class BiggestNumBetween2NumByIfElseCondition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your first num");
		int x=sc.nextInt();
		
		System.out.println("enter your second num");
		int y=sc.nextInt();
		
		if(x>y) {
			System.out.println("first num is biiger:"+ x);
		}
		else {
			System.out.println("second num is bigger:"+ y);
		}
		

	}

}