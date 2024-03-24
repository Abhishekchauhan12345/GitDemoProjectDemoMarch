package conditionalOperator;

import java.util.Scanner;

public class NoDividedBy7OrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no");
		int x=sc.nextInt();
		String result=x%7==0?"no id divided by 7":"no is not divided by 7";
		System.out.println(result);
	}

}
