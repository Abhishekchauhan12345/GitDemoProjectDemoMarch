package importantProgram;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int table=num;
		
		for(int i=1; i<=10; i++) {
			System.out.println(table+"*"+i+"="+ num*i);
		}
		
		
	}

}
