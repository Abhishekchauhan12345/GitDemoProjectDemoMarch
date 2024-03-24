package basicProgram;

import java.util.Scanner;

public class BiggestNumBetween3Num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your first num");
		int x=sc.nextInt();
		
		System.out.println("enter your second num");
		int y=sc.nextInt();
		
		System.out.println("enter your third num");
		int z=sc.nextInt();
		
		if(x>y &&x>z) {
			System.out.println("first num is bigger:"+ x);
		}
		else if(y>x &&y>z) {
			System.out.println("second num is bigger:"+ y);
		}
		else {
			System.out.println("third no is bigger:"+ z);
		}
		System.out.println("program ends ");
		

	}

}
