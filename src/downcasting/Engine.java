package downcasting;

public class Engine extends Car{
	
	String name="sjeuf";
	int engineNo=5443;

	public static void main(String[] args) {
		
		//Upcasting statement
		Car c=new Engine();
		System.out.println(c.color);
		System.out.println(c.price);
		
		//downcasting statement
		Engine e=(Engine)c;
		System.out.println(e.name);
		System.out.println(e.price);
		System.out.println(e.engineNo);
		System.out.println(e.model);
		
		
	}

}
