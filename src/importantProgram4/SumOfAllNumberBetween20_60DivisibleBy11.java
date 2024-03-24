package importantProgram4;

public class SumOfAllNumberBetween20_60DivisibleBy11 {

	public static void main(String[] args) {
		
		int x=60;
		int sum=0;
		
		int y=20;
		
		while(y<=60) {
			if(y%11==0) {
				System.out.println("number divisible by 11 between 20 to 60 is:"+ y);
				sum=sum+y;
			}
			y++;
		}
		System.out.println("sum of number between 20 to 60 which is divisible by 11 is:"+ sum);
		

	}

}
