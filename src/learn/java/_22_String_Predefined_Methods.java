package learn.java;

public class _22_String_Predefined_Methods {

	public static void main(String[] args) {
		
		String s1 = "Selenium WebDriver";
		String s2 = "Selenium IDE";
		String s3 = "Selenium WebDriver";
		String s4 = "Selenium RC";
		
		System.out.println(s1.equals(s3)); //equals() - compare two strings
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s4));

		System.out.println(" ");
		
		String s5 = "This is core java program";
		
		System.out.println(s5.length()); //length() - to find the length of string 
		
		System.out.println(" ");
		
		System.out.println(s5.substring(5)); //to retrieve the portion from the actual string
		
		System.out.println(" ");
		
		String s6 = "                 This is practice program           ";
		String s7 = s6.trim();
		System.out.println(s6); 
		System.out.println(s7); //remove the spaces before and after string
		
		System.out.println(" ");
		
		
		System.out.println(s6.indexOf("This"));
		System.out.println(s6.indexOf("practice"));
		System.out.println(s6.indexOf("program"));
		System.out.println(s6.indexOf("java")); //Returns -1 if text is not available
		
		System.out.println(" ");


		
		String[] s8 = s5.split(" "); //split the text into different parts based on space,symbol,text
		for (String temp : s8) {
			
			System.out.println(temp);
			
		}
		
	}

}
