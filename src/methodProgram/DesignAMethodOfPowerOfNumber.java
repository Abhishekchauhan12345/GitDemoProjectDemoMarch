package methodProgram;

import java.util.Scanner;

public class DesignAMethodOfPowerOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base value");
		int base=sc.nextInt();
		System.out.println("enter expo value");
		int expo=sc.nextInt();
		System.out.println("power of number "+power(base,expo));
		

	}
	public static int power(int base, int expo) {
		int powerOfNum=1;
		
		for(int i=1; i<=expo; i++) {
			powerOfNum=powerOfNum*base;
		}
		return powerOfNum;
	}

}
