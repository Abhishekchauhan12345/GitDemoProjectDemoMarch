package impotantArrayProgram;

public class SortingInDescendingOrder {

	public static void main(String[] args) {
		
		
		int[]a= {20,30,4,6,9,10,59};
		int min;
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
			min=i;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j]> a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ,");
		}
		System.out.println("second largest element of array is:"+ a[1]);

	}

}
