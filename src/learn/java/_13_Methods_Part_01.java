package learn.java;
//creating multiple methods

public class _13_Methods_Part_01 {

	public static void main(String[] args) {
		
		int a=5, b=6;
		
		int c=a+b;
		
		System.out.println("The sum of a and b is "+ c);
		
		methodA();// Method calling statement (main method calling other method)

	}
	
	public static void methodA() {
		
		System.out.println("Inside Method A");
		
		methodB(); // Method calling statement (non-main method calling other method)
		
	}
	
	public static void methodB() {
		
		System.out.println("Inside Method B");		
			
	}
		
	

}
