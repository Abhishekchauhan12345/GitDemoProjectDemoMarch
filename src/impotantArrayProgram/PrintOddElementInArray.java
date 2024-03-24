package impotantArrayProgram;

public class PrintOddElementInArray {

	public static void main(String[] args) {
		int[]a= {2,3,4,5,6,7,9,8,1};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
