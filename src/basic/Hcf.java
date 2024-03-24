package basic;

public class Hcf {

	public static void main(String[] args) {
		int x=4;
		int y=8;
		
		int hcf=1;
		for(int i=1; i<=x; i++) {
			if(x%i==0 &&y%i==0) {
				hcf=i;
				
			}
			System.out.println(hcf);
		}
	}

}
