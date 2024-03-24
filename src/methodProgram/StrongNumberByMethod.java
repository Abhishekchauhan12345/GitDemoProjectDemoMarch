package methodProgram;

public class StrongNumberByMethod {

	public static void main(String[] args) {
		factroial(146);
		

	}
	public static int factroial(int n) {
		
		int sum=0;
		int x=n;  // first store n into any variable because n is going to change
		while(n!=0) {
			
			int rem=n%10;
			int fact=1;
			
			for(int i=1; i<=rem; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==x) {
			System.out.println("it is strong number");
			
		}
		else {
			System.out.println("it is not strong number");
		}
		return sum;
	}

}
