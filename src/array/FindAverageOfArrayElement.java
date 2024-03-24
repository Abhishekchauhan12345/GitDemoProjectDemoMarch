package array;

public class FindAverageOfArrayElement {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9,11,5};
		
		double average=0;
		int sum=0;
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
			count++;
			average=sum/count;
		}
		System.out.println("\nsum is:"+ sum+"\ncount is:"+ count+"\naverage is:"+ average );
		

	}

}
