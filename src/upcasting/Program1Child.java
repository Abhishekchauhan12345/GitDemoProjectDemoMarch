package upcasting;

public class Program1Child extends Program1Parent{
	
	int x=20;
	String name="Abhishek";

	public static void main(String[] args) {
		
		// Upcasting statement
		Program1Parent p=new Program1Child();
		System.out.println(p.y);
		System.out.println(p.x);
		System.out.println(p.b);
		
		
		
		

	}

}
