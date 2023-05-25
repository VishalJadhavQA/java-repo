package learn.java;

public class _04_Variables {
	
	
	static int b = 10; //Instance variables static
	

		public static void main(String[] args) {
	
			int a = 5; //Local variables
			
			System.out.println(a);
			System.out.println(b); 
			 
		}
	
		public static void GlobalVariable1() {
				
				System.out.println(b); //will not give error as method is static and try to access static variable b
				
			}
			
}
