package learn.java;

public class _09_Conditional_Operator {

	public static void main(String[] args) {
		
		int a=5, b=3, c, d;

		c = a>b ? 6 : 9 ;
		
		d = a<b ? 2 : 7 ;
		
		System.out.println(c);//6
		System.out.println(d);//7
		
		String s = (10 > 5) ? "Greater" : "Smaller" ;
		System.out.println(s);	

	}

}
