package importantProgram;

import java.util.Scanner;

public class PrintGoodMorningWhenNoIs8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		if(num==8) {
			System.out.println("GOOD MORNING");
		}
		else {
			System.out.println("program ends");
		}

	}

}
