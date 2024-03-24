package array;

import java.util.Scanner;

public class CopyOneArrayElementIntoAnotherArray {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter size of array");
		 int size=sc.nextInt();
		 
		 int[]a=new int[size];
		 int[]b=new int[size];
		 System.out.println("enter array element");
		 
		 for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
			
		 }
		 System.out.println("first array element");
		 for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
				
		 }
		 System.out.println("\nsecond array element");
		 for(int i=0; i<a.length; i++) {
				
			 b[i]=a[i];
			 System.out.print(b[i]+" ");
					
		 }
		 

	}

}
