package importantProgram;

import java.util.Scanner;

public class PrintNoDividedBy12And15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		if(num%12==0 && num%15==0) {
			System.out.println(num+ " is divided by 12 and 15");
		}
		else {
			System.out.println(num+ " is not divided by 12 and 15");
		}

	}

}
