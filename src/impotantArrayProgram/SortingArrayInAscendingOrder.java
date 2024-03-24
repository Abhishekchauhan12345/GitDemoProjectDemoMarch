package impotantArrayProgram;

public class SortingArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int[]a= {20,44,323,43,234,24,45};
		
		int temp=0;
		int min;
		
		for(int i=1; i<a.length; i++) {
			min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print( a[i]+" ,");
		}
		System.out.println("second largest element in array is:"+ a[5]);

	}

}
