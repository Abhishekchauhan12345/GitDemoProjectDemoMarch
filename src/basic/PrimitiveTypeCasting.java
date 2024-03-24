package basic;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		// widening
		int x=10;
		double d =x;
		
		// narrowing
		double d1=100;
		int x1=(int) d1;
		
		// narrowing
		byte b=10;
		byte c=20;
		byte d2=(byte) (b+c);

	}

}
