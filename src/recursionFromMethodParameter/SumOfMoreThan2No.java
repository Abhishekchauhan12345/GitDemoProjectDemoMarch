package recursionFromMethodParameter;

public class SumOfMoreThan2No {

	public static void main(String[] args) {
		System.out.println(sum(sum(20,50),20));
		
	}
	public static int  sum(int x, int y) {
		
		int result=x+y;
		return result;
		
	}

}
