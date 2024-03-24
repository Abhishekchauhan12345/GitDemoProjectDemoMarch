package string;

public class DifferenceBetweenEqualsAndEqualsEqualsMethod {
	
	public static void main(String[]args) {
		
		String s1= "Abhishek";
		String s2= "Abhishek";
		
		System.out.println(s1==s2);  // it compare the Address or reference of object
		
		String s3= new String("poonam");
		String s4= new String("poonam");
		
		System.out.println(s3.equals(s4)); // it compare the String object content 
	

	



	}

}
