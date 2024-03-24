package importantProgram4;

public class PrintNumberBetween1_100DivisibleByOnly9 {

	public static void main(String[] args) {
		
		int x=100;
		int i=1;
		
		while(i<=100) {
	
			if(i%9==0) {
				System.out.println("number which is divided by 9 between 1 to 100 is:"+ i);
				
			}
			i++;
		}

	}

}
