package importantProgram3;

import java.util.Scanner;

public class PowerOfAnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base");
		int x=sc.nextInt();
		
		System.out.println("enter exponent");
		int y=sc.nextInt();
		
		int product=1;
		
		while(y>0) {
			product= product*x;
			y--;
		}
		System.out.println(product);
	}

}
