package methodProgram;

public class FactorialByRecursion {

	public static void main(String[] args) {
		System.out.println("factorial is:"+ factorial(5));
		

	}
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
