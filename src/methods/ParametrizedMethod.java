package methods;

import java.util.Scanner;

public class ParametrizedMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base of traingle");
		int base=sc.nextInt();
		
		System.out.println("enter base of traingle");
		int height=sc.nextInt();
		area(base,height);
		
		perimeter(5,5);
		
		
}
	public static void area(int base, int height) {
		double  AreaOftraingle=0.5*(base*height);
		System.out.println(AreaOftraingle);
		
	}
	public static void perimeter(int length, int breadth) {
		int perimeterOfTraingle = 2*(length+breadth);
		System.out.println(perimeterOfTraingle);
		
		
	}

}
