package recursion;

import java.util.Scanner;

public class BiggestNumBetween2Num {
	
	public static void main(String[] args) {
		int a=big(10,20);
		System.out.println(a);
	
	}
	public static int  big(int x, int y) {
		/*Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		*/
		int b=x>y?x:y;
		return b;
	}

}
