package importantProgram5;

import java.util.Scanner;

public class ExtractEvenDigitInNumberAndFindFactorialOfEvenDigitInAnumber {
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int rem;
		
		factorial(rem);
	
		
		int i=1;
		
		while(i<=num) {
			 rem=num%10;
			if(rem%2==0) {
			
				System.out.println(rem);
			}
			num=num/10;
			i++;
		}
	}
		public static int  factorial(int x) {
			int fact=1;
			for(int i=1; i<=x; i++) {
				fact=fact*x;
				
			}
			return fact;
			
		
		
	}
		
}



