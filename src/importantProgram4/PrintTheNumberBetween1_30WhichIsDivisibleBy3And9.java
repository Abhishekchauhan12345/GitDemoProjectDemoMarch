package importantProgram4;

public class PrintTheNumberBetween1_30WhichIsDivisibleBy3And9 {

	public static void main(String[] args) {
		
		int x=30;
		
		int i=1;
		
		while(i<=30) {
			if(i%3==0 || i%9==0) {
				System.out.println("number which is divisible by 3 and 9 between 1 to 30 is:"+ i);
			}
			i++;
		}

	}

}
