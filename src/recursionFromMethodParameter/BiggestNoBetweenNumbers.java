package recursionFromMethodParameter;

public class BiggestNoBetweenNumbers {

	public static void main(String[] args) {
		
		System.out.println(bigNum(bigNum(10,20),10));
		
	
	}
	public static int bigNum(int a, int b) {
		int max=a>b?a:b;
		return max;
		
	}

}
