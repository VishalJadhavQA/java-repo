package learn.java;

public class _33_Method_Overriding_03 {

	public static void main(String[] args) {
		
		_31_Method_Overriding_01 M1 = new _31_Method_Overriding_01(); //parent class object creation
		
		M1.Samsung(); //calling parent class
		
		
		_32_Method_Overriding_02 M2 = new _32_Method_Overriding_02(); //child class object creation
		
		M2.Samsung(); //calling child class
		System.out.println("-------------------------------------");
		
		
		
		M1.Nokia(); //calling parent class
		M2.Nokia(); //calling parent class by extending to parent (as it don't have parameter) with child class object reference.
		
		M2.Nokia(1); //calling child class (as it have parameter)
		
		
		
		
	}

}
