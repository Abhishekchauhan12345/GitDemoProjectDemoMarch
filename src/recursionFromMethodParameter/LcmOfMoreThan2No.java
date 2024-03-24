package recursionFromMethodParameter;

public class LcmOfMoreThan2No {

	public static void main(String[] args) {
		System.out.println(lcm(lcm(10,20),5));
		
	}
	public static int lcm(int x, int y) {
		int lcm;
		int big=x>y?x:y;
		
		for(lcm=big; ; lcm+=big) {
			if(lcm%x==0 && lcm%y==0) {
				break;
			}
			}
		return lcm;
	}

}
