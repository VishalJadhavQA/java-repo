package learn.java;

public class _07_Logical_Operators {

	public static void main(String[] args) {

		//And operator
		
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false
		System.out.println(false&&false);//false
		System.out.println("----------------------------------------------");
		
		
		//Or operator
		System.out.println(true||true);//true
		System.out.println(true||false);//true
		System.out.println(false||true);//true
		System.out.println(false||false);//false
		System.out.println("----------------------------------------------");
		
		
		//Not operator
		System.out.println(!true);//false
		System.out.println(!false);//true

	}

}
