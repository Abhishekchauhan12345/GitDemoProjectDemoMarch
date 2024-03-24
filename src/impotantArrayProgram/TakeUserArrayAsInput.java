package impotantArrayProgram;

import java.util.Scanner;

public class TakeUserArrayAsInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of an array");
		int size=sc.nextInt();
		//System.out.println(size);
		System.out.println("enter array element");
		
		int []arr= new int[size];
		
		for(int i=0; i<arr.length; i++) {
			 arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ,");
		}

	}

}
