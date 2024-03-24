package impotantArrayProgram;

public class CalculateSumOfAnArrayElement {

	public static void main(String[] args) {
		int[]a= {10,3,4,5,24,60,34};
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			int rem=a[i] ;
			sum=sum+rem;
				
			
		}
		System.out.println(sum);

	}

}
