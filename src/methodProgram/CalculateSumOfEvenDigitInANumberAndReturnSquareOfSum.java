package methodProgram;

public class CalculateSumOfEvenDigitInANumberAndReturnSquareOfSum {

	public static void main(String[] args) {
		System.out.println("square of number "+ even(125));

	}
	
	public static int even(int n) {
		
		int i=1;
		int sum=0;
		int square=1;
		while(i<=n) {
			
			int rem =n%10;
			if(rem%2==0) {
				sum=sum+rem;
				System.out.println(rem);
			}
			n=n/10;
			square=sum*sum;
		}
		return square;
	}

}
