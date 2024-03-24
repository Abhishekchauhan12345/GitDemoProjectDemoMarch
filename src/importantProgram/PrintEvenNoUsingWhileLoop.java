package importantProgram;

import java.util.Scanner;

public class PrintEvenNoUsingWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any no");
		
		int num=sc.nextInt();
		
		int i=1;
		while(i<=num) {
			if(i%2==0) {
				System.out.println("even num from 1 to "+num+" is:"+ i);
			}
			i++;
		}
		System.out.println("program ends");
		
		
		

	}

}
