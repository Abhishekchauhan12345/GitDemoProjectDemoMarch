package impotantArrayProgram;

public class PrintEvenIndexValue {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		
		for(int i=0; i<a.length; i=i+2) {
			
			int evenSum=a[i];
			sum=sum+evenSum;
			System.out.print(a[i]+" ");
			
			
		}
		System.out.println("\nsum of even index value "+ sum);
		
		

	}

}
