package methodProgram;

public class DesignMethodToAddTwoNumberAndCallIntoMainMethodAndCheckSumIsEvenOrOdd {

	public static void main(String[] args) {
		
		sum(2,4);
		
	}
	public static int  sum(int x, int y) {
		int sum1=x+y;
		
		System.out.println("sum is :"+ sum1);
		
		if(sum1%2==0) {
			System.out.println("sum is even");
		}
		else {
			System.out.println("sum id odd");
		}
		return sum1;
	}

}
