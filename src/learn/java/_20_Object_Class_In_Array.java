package learn.java;

import java.util.Iterator;
import java.util.Objects;

public class _20_Object_Class_In_Array {
	
	
	public static void main(String[] args) {
		
	/*we can assign any type of data into the variable
	which is declared as Object Arrays type */
	
	Object[] b = {5,7,8.12,'V',"string",true}; //Values of all data type
	
	for(Object temp:b) {
		
		System.out.println(temp);		
		
	}

	}
}