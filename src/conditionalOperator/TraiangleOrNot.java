package conditionalOperator;

import java.util.Scanner;

public class TraiangleOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first side value");
		int a=sc.nextInt();	
		
		System.out.println("enter second side value");
		int b=sc.nextInt();	
		
		System.out.println("enter third side value");
		int c=sc.nextInt();	
		
		String result=(a+b>c && b+c>a && a+c>b)?"it is trainagle":"it is not traingle";
		System.out.println(result);

}
}
