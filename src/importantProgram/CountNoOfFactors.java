package importantProgram;

import java.util.Scanner;

public class CountNoOfFactors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int count=0;
		int i=2;
		
		while(i<=num/2) {
			if(num%i==0) {
				System.out.println("numbers are:" +i);
				count++;
			}
			i++;
			
		}
		System.out.println("total no of factor of "+num+" is "+ count);

	}

}
