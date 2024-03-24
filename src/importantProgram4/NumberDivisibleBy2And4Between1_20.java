package importantProgram4;

public class NumberDivisibleBy2And4Between1_20 {

	public static void main(String[] args) {
		
		int x=20;
		
		int i=1;
		
		while(i<=20) {
			
			if(i%2==0 || i%4==0) {
				System.out.println("number between 1 to 20 divisible by 2 and 4 is :"+ i);
			}
			i++;
		}
		

	}

}
