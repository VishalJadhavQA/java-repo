package learn.java;

public class _15_Methods_Part_03 {

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		methodA(5); // Method calling statement 

	}
	
	
	public static void methodA(int a) {
		
		 System.out.println("Inside Method A");
		 System.out.println("Value taken from methodA calling statement is " + a);
		
		 int x = methodB(7); // Method calling statement with return integer value
		 System.out.println("Integer value returned by methodB is "+ x);
		
	}
	
	public static int methodB(int b) {     
		
		System.out.println("Inside Method B");
		System.out.println("Value taken from methodB calling statement is " + b);
		
		String y = methodC("Call method C"); // Method calling statement with return string value
		System.out.println("String value returned by methodC is " + y);
		
		return 10 ; //return integer value
	}
	
	public static String methodC(String c) {     
		
		System.out.println("Inside Method C");
		System.out.println("Value taken from methodC calling statement is " + c);
		
		return "Successful";	//return string value	
		
	
	}	
	
	
}
