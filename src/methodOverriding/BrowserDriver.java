package methodOverriding;

public class BrowserDriver {

	public static void main(String[] args) {
		
		Browser b=new Firefox();
		b.test();
		
		Browser b1=new Chrome();
		b1.test();
		
		
	}

}
