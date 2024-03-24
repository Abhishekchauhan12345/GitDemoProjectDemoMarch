package basic;

import java.util.Scanner;

public class FibonaccySeries {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int originalNum=num;
		
		for(int i=1; i<=num; i++) {
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		System.out.println(sum);
		if(sum==originalNum) {
			System.out.println("number is armstrong number");
		}
		else {
			System.out.println("num is not armstrong umber");
		}
		

	}

}
