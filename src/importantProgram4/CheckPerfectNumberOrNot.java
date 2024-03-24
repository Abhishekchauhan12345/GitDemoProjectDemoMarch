package importantProgram4;

import java.util.Scanner;

public class CheckPerfectNumberOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to check it is perfect or not");;
		int num=sc.nextInt();
		int i=1;
		int perfect=0;
		while(i<=num/2) {
			if(num%i==0) {
				
				perfect=perfect+i;
				System.out.println(i);
				
			}
			i++;
		}
		if(perfect==num) {
		System.out.println("it is perfect number");
		}
		else {
			System.out.println("it is not perfect number");
		}
	
	}
}
	


