package importantProgram3;

import java.util.Scanner;

public class NumberIsPalidromeOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int tem=num;  //   important line you should first store the in any variable because it is change
		int rev=0;
		
		while(num>00) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		if(rev==tem) {
		System.out.println("entered number is palidrome num");
	}
		else {
		System.out.println("entered num is not palidrome");
		}
	}

}
