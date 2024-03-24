package methodProgram;

public class Print1_10ByRecursionMethod {

	public static void main(String[] args) {
		System.out.println(printNum(10));

	}
	public static String  printNum(int n) {
		if(n==1) {
			return 1+ " ";
		}
		else {
			return n+ " " + printNum(n-1);
		}
	}

}
