package basicProgram;

import java.util.Scanner;

public class DisplayGoodMorningWhenNoIs8And10And11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int num=sc.nextInt();
		
		System.out.println("enter second number");
		int num1=sc.nextInt();
		
		System.out.println("enter third number");
		int num2=sc.nextInt();
		
		if(num==8 && num1==10 && num2==11) {
			System.out.println("Good Morning");
		}
		else {
			System.out.println("program ends");
		}

	}

}
