package methodProgram;

public class DesignAMethodOfSumOfDigitOfANumAndReturnSum {

	public static void main(String[] args) {
		int s=sum(123);
		System.out.println(s);
		

	}
	public static int sum(int n) {
		int sum=0;
		
		for(int i=1; i>=0; i++) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			
		}
		return sum;
	}

}
