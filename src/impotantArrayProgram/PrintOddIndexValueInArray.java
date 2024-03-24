package impotantArrayProgram;

public class PrintOddIndexValueInArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int i=1; i<a.length; i=i+2) {
			
			int oddSum=a[i];
			sum=sum+oddSum;
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n sum of odd place value in array is:"+ sum);

	}

}
