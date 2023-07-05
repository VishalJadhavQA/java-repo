package learn.java;

public class _18_Shortcut_Single_Dimensional_Array {

	public static void main(String[] args) {
		
		/* Single Dimensional Array Shortcut */
		
		int[] b = {5,3,9};
		
		int c = b.length; // For finding length of array
		System.out.println(" Length of array is = " + c);
		
		
		//For loop
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		
		}
		
		
		//For each loop
		for (int x : b) {
			
			System.out.println(x);
		}
		
	}

}
