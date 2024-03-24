package importantProgram3;

import java.util.Scanner;

public class CubeOfEveryDigitInANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int cube;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2!=0) {
				cube=rem*rem*rem;
				System.out.println("cube of "+ rem + " is:"+ cube);
			}
			num=num/10;
		}

	}

}
