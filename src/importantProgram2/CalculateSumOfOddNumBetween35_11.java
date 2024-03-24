package importantProgram2;

public class CalculateSumOfOddNumBetween35_11 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=35; i>11; i--) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.print(i+" ");
				
			}
		}
			System.out.println("sum of even no between 35 to 11 is:"+ sum);

	}

}
