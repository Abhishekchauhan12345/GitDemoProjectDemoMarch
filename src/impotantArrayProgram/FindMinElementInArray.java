package impotantArrayProgram;

public class FindMinElementInArray {

	public static void main(String[] args) {
		int[]a= {2,4,5,3,6,1,9};
		
		int min=a[0];
		int minimum=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				minimum=a[i];
				
			}
		}
		System.out.println("minium value of array :"+ minimum);

	}

}
