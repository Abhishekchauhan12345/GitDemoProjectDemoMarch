package impotantArrayProgram;

public class CalculateSumOfEvenElementInArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				
				int even=a[i];
				sum=sum+a[i];
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println("\nsum of even array element is:"+sum);

	}

}
