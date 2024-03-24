package impotantArrayProgram;

public class FindLargestElementInArray {

	public static void main(String[] args) {
		int []a= { 1,2,3,4,5,6,7,8,9};
		
		int max=a[0];
		int largest=0;
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				
				 largest=a[i];
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println("\nlargest element in array is:"+ largest);

	}

}
