package learn.java;

public class _19_Two_Dimensional_Array {
	
	public static void main(String[] args) {
		
		int [][] a = {{2,4,6,8},{1,3,5,7}}; // Two Dimensional Array
		
		System.out.println("length of two dimensional array is " + a.length); //2
		System.out.println("length of first array is " + a[0].length); // length of first array 4
		System.out.println("length of second array is " + a[1].length); // length of second array 4
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");

		//for loop two dimensional array
		for (int i = 0; i<a.length; i++) {
			
			for (int j = 0; j<a[0].length; j++) {
				
				System.out.print(a[i][j]+ " ");
								
			}
				System.out.println();
			
			
		}
		

	}

}
