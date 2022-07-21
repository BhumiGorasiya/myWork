package function;

// String method

public class Practical_3 {
	public static void main(String[] args) {
		
	String str = "Tops"; //here str is object of String class.
	
	// upper case
	System.out.println(str.toUpperCase());
		
	// lower case
	System.out.println(str.toLowerCase());
	
	// length
	System.out.println(str.length());
	
	//charAt
	System.out.println(str.charAt(2));
	
	//iterate
	
	for(int i = 0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		System.out.println(ch);
	}
	
	String s = str.toUpperCase();
	System.out.println("Value of s : "+s);
	System.out.println("Value of str : "+str);
	
	// equals and equalsIgnorecase
	
	String str1 = "tops", str2 = "Tops   ";
	
	if (str1.equals(str2))
	{
		System.out.println("Both are equals");
	}else {
		System.out.println("Both are diffrent");
	}
	
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println("Both are equals");
	}else {
		System.out.println("Both are diffrent");
	}
	
	//trim
	
	System.out.println(str1.length());
	System.out.println(str2.trim().length());

	// Split
	
	String str3 = "welcome   to tops technologies";
	String array[] = str3.split("str3");
	
		for(String st : array)
		{
			System.out.println(st);
		}
		
	//SubString
	
	String str4 = "tops tech";
	System.out.println(str4.substring(2,6));
	
	// replace
	
	System.out.println(str4.replace("tech","technologies"));
	
	// concat
	
	System.out.println(str3+str4);
	
	// indexOf
	
	System.out.println(str4.indexOf("t"));
	
	// contains
	
	if(str3.contains("wlcome".trim()))
	{
		System.out.println("it contains this String");
	}else {
		System.out.println("it doe not contains this String");
	}
	
   }
}
