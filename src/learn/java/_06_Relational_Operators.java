package learn.java;

public class _06_Relational_Operators {

	public static void main(String[] args) {
		
int a=3,b=6,c=3,d=9;
		
		//Relational operator
		
		
		System.out.println(a==b);//false
		System.out.println(a==c);//true
		System.out.println("----------------------------------------------");
		
		System.out.println(a!=b);//true
		System.out.println(a!=c);//false
		System.out.println("----------------------------------------------");
		
		System.out.println(a>b);//false
		System.out.println(a>c);//false
		System.out.println("----------------------------------------------");
		
		System.out.println(a<b);//true
		System.out.println(a<c);//false
		System.out.println("----------------------------------------------");
		
		System.out.println(a>=b);//false
		System.out.println(a>=c);//true
		System.out.println("----------------------------------------------");
		
		System.out.println(a<=b);//true
		System.out.println(a<=c);//true
		System.out.println(c<=d);//true
	}

}
