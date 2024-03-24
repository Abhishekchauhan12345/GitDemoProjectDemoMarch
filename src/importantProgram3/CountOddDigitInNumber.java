package importantProgram3;

import java.util.Scanner;

public class CountOddDigitInNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int oddnum=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2!=0) {
				oddnum++;
				
			}
			num=num/10;
		}
		System.out.println(oddnum);

	}

}
