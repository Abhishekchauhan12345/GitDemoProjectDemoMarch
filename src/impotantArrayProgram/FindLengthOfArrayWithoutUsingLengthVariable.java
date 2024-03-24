package impotantArrayProgram;

public class FindLengthOfArrayWithoutUsingLengthVariable {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		
		int count=0;
		for(int i:a) {
			count++;
		}
		System.out.println("length of array is:"+ count);

	}

}
