package importantProgram3;

import java.util.Scanner;

public class CountEvenDigitInNumber {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the number");
		 int num=sc.nextInt();
	
		 int evenCount=0;
		 
		 while(num>0) {
			 int rem=num%10;
			 if(rem%2==0) {
				 evenCount++;
				 
			 }
			 num=num/10;
			 
			 
			 
		 }
		 System.out.println(evenCount);
		 
		 }

	}


