package recursionFromMethodParameter;

public class HcfOfMoreThan2No {

	public static void main(String[] args) {
		System.out.println(hcf(2,4));
		
	}
	public static int  hcf(int x, int y) {
		int hcf=1;
		
		int min=x>y?x:y;
		
		for(int i=1; i<=min; i++) {
			if(x%i==0&& y%i==0) {
			hcf=i;
			}
		}
		return hcf;
	}

}
