package recursion;

public class BasicRecursion {
	static int count=0;

	public static void main(String[] args) {
		sum();
		

	}
	public static void sum() {
		System.out.println("this is sum method");
		
		count++;
		if(count<=10) {
			
			sum();
		}
		else {
			System.out.println("out of loop");
		}
	}

}
