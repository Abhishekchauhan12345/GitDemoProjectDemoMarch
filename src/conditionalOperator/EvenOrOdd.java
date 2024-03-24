package conditionalOperator;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no to check it is even or odd");
		int x=sc.nextInt();
		
		String result = x%2==0?"it is even no":"it is odd no";
		System.out.println(result);

	}

}
