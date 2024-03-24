package array;

public class CalculateSumOfIndexValueInArray {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		System.out.println("element at even index value");
		for(int i=0; i<a.length; i=i+2) {      // if you want to odd element sum then only change the starting value of index from 1.
			
			System.out.print(a[i]+" ");
			
			sum=sum+a[i];
		}
		System.out.println("\nsum of even element :"+ sum);

	}

}
