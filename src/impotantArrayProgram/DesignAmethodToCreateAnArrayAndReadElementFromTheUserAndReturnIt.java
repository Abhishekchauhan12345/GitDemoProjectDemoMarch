package impotantArrayProgram;

import java.util.Scanner;

public class DesignAmethodToCreateAnArrayAndReadElementFromTheUserAndReturnIt {

	public static void main(String[] args) {
		
		int [] user=createArray();
		for(int i=0; i<user.length; i++) {
			System.out.print(user[i]+" ");
		}

	}
	
	public static int[] createArray() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.println("enter value of aaray element");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
