package learn.java;
//single, multiple parameterized methods

public class _14_Methods_Part_02 {

	public static void main(String[] args) {
		
		System.out.println("Inside main method ");
		
		methodA();// calling non-parameterized method

	}
	
	public static void methodA() {
		
		System.out.println("Inside Method A");
		
		methodB(9);   /*calling single parameterized method*/
		
	}
		
	
	public static void methodB(int x) {     
		
		System.out.println("Inside Method B");
		System.out.println("Value of x is = " + x);
		
		methodC(5, 10.11 , "This is string value", true , '#' ); /*Arguments*/
		
		/*calling multi-parameterized method*/	
		
	}

	
	public static void methodC(int s, double t, String u, boolean v, char w ) { 

		System.out.println("Paramerts are storing s = " + s);	/*Parameters*/
		System.out.println("Paramerts are storing t = " + t);
		System.out.println("Paramerts are storing u = " + u);
		System.out.println("Paramerts are storing v = " + v);
		System.out.println("Paramerts are storing w = " + w);
		
			
	}

}

