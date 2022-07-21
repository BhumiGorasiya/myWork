package exception;

public class Practical_1 {

public static void main(String[] args) {
	
	System.out.println("Program starts");
	
	int num[] = {23,56,34,23,56};
	
	System.out.println("Value at index-7 :"+num[3]);
	
	String str = "123 Rs.";
	System.out.println(Integer.parseInt(str)+10);    //convert String to integer
	
	String name = null;
	System.out.println("length : "+name.length());
	
	int nums = 20;
	System.out.println("result : "+(20/0));
	
	System.out.println("All code executed");
	
	
}
}
