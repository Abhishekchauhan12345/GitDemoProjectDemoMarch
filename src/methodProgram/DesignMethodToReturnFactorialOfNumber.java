package methodProgram;

public class DesignMethodToReturnFactorialOfNumber {

	public static void main(String[] args) {
		factorial(5);
		

	}
	public static int factorial(int n) {
		
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		
		System.out.println("factorial of "+n+" is:" + fact);
		return fact;
		
	}

}
