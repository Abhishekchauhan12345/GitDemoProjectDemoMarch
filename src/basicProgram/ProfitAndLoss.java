package basicProgram;

import java.util.Scanner;

public class ProfitAndLoss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter cost price of product");
		double cp=sc.nextDouble();
		System.out.println("enter selling price of product");
		double sp=sc.nextDouble();
		
		double profit=(sp-cp);
		
		if(profit>0) {
			System.out.println("User is in profit and profit % is:" + profit/cp*100+ "%");
		}
		else if(profit<0) {
			System.out.println(" User is in loss and loss % is:" + profit/cp*100+ "%");
		}
		
		
	}

}
