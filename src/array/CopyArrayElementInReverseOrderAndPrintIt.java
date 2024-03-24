package array;

public class CopyArrayElementInReverseOrderAndPrintIt {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5};
		int[]b=new int[5];
		
		System.out.print("original array ");
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]+" ");
		}
		
		System.out.print("second array element in reverse order");
		for(int i=a.length-1; i>=0; i--) {
			
			b[i]=a[i];
			
			System.out.print("\n"+b[i]+" ");
		}

	}

}
