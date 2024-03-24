package impotantArrayProgram;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) {
		
		int[]a={1,2,3,4,5};
		System.out.println("original array");
		System.out.println(a.length);
		
		System.out.println("array element");
		for(int i=0; i<a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nreverse array element");
		for(int i=a.length-1; i>=0; i-- ) {
			System.out.print(a[i]+" ");
			
		}

	}

}
