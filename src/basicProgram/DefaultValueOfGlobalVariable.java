package basicProgram;

public class DefaultValueOfGlobalVariable extends Object {
	
	int x;
	static double y;
	static char c;

	public static void main(String[] args) {
		
		DefaultValueOfGlobalVariable a= new DefaultValueOfGlobalVariable();
		
		System.out.println(a.x);
		System.out.println(y);
		System.out.println(c);
		System.out.println(a.toString()); // toString() method print the abject address and it is present in Parent class i.e Object Class
		System.out.println(a);
		
		
	}

}
