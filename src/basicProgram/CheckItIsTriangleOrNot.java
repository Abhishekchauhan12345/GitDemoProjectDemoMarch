package basicProgram;

import java.util.Scanner;

public class CheckItIsTriangleOrNot {

	public static void main(String[] args) {
		System.out.println("This is the program to check validation of triangle");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first side of triangle");
		int x=sc.nextInt();	
		
		System.out.println("enter second side of triangle");
		int y=sc.nextInt();	
		
		System.out.println("enter third side of triangle");
		int z=sc.nextInt();	
		
		if(x+y>z && y+z>x && x+z>y) {
			System.out.println("It is triangle");
		}
		else {
			System.out.println("it is not triangle");
		}

	}

}
