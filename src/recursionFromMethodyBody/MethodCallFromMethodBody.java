package recursionFromMethodyBody;

public class MethodCallFromMethodBody {
	
	static int i=1;

	public static void main(String[] args) {
		System.out.println("this is main method");
		test();
		System.out.println("program complected");
		
		}
	public static void test() {
		
		i++;
		if(i<=5) {
			System.out.println("this is test method");
			test();
		}
	}

}
