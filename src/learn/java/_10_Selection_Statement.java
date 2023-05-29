package learn.java;

public class _10_Selection_Statement {

	public static void main(String[] args) {
		
		int a = 5, b= 3,c=2, d=12;
		
		
		//If statement
		if (a>b)
		{
			System.out.println("a is greater than b");
		}

		
		//If...else statement
		
		if (a>c) {
			
			System.out.println("a is greater than c");
			
		}
		else {
			
			System.out.println("a is less than c");
			
		}
		
		
		//If...elseIf()...else
		
		if(a<b) {
			
			System.out.println("a is less than b");
			
		}else if(b<c)
		{
			System.out.println("b is less than c");
			
		}else {
			
			System.out.println("Above condition are false");
		}
		
		
		//Switch condition
		
		int x=1;
		
		switch (x) {
		case 1:
			
			System.out.println("Value is one");
			break;
			
		case 2:
			
			System.out.println("Value is second");
			break;

		default:
			System.out.println("Value is default");
			break;
		}
				

	}

}
