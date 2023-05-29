package learn.java;

public class _12_Transfer_Statement {

	public static void main(String[] args) {
		//for loop
		
		for (int i = 0; i < 5 ; i++) {
			
			if (i==3) {
				
				break;
				
			} 
			System.out.println("The value of i is " + i);
			
		
		}

		   System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		//continue loop
		
		for (int i = 0; i < 5 ; i++) {
					
				if (i==3) {
						
					continue;
						
				}
					
		  System.out.println("The value of i is " + i);
					
					
			}		

	}

}
