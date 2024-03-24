package importantProgram5;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp=num;
		int i=1;
		int cube=0;
		
		while(i<=num) {
			int rem=num%10;
			cube=cube+rem*rem*rem;
			num=num/10;
		}
		
		if(cube==temp) {
		System.out.println("number is armstrong number");
		}
		else {
			System.out.println("number is not armstrog number");
		}

	}

}
