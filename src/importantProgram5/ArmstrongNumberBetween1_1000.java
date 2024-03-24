package importantProgram5;

public class ArmstrongNumberBetween1_1000 {

	public static void main(String[] args) {
		
		for(int i=1; i<=1000; i++) {
			if(armstrong(i)) {
				System.out.println("armstrong number between 1 to 1000:"+ i);
			}
			
		}
		
	}
		public static boolean armstrong(int n) {
			int sum=0;
			int originalNum=n;
			int i=1;
			
		while(i<=n) {
			
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		return sum==originalNum;
		
	
		
		}	
		

	}


