package importantProgram4;

import java.util.Scanner;

public class PrintDivisiorOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int count=0;
		
		int i=1;
		while(i<=num/2) {
			if(num%i==0) {
				System.out.println("no. of divisior of "+ num+ " is:"+ i );
				count++;
			}
			i++;
		}
		System.out.println("total number of divisior of "+ num+ " is:"+ count);
		
	}

}
