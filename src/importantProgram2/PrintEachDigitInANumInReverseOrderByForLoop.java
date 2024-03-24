package importantProgram2;

import java.util.Scanner;

public class PrintEachDigitInANumInReverseOrderByForLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		
		//int num=sc.nextInt();
		
		int rem=0;
		int rev=0;
		
		
		for(int num=sc.nextInt(); num>0 ;num=num/10 ) {
			rem =num%10;
			
			rev=rev*10+rem;
			
			//num=num/10;
			
			
			
			 
			
			
			
		}
		System.out.println(rev);
			
		

	}

}
