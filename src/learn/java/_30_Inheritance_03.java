package learn.java;

public class _30_Inheritance_03 {

	public static void main(String[] args) {
		
		_28_Inheritance_01 ieh = new _28_Inheritance_01(); //object creation
		
		ieh.start_test();
		
		ieh.testcase_number = 01;
		ieh.testcase_name = "New";
		ieh.testdetails();
		
		
		_29_Inheritance_02 	status = new _29_Inheritance_02(); //object creation
	
		status.testcase_number = 02;
		status.testcase_name = "Demo"; //accessing variable of parent class
		
		status.version = "V00.01";
		status.priority = "High";
		
		status.testdetails();   //accessing method of parent class
		
		status.stop_test();
				
		
	}

}
