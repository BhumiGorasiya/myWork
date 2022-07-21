package collaction;

public class WrapperClass {

	public static void main(String[] args) {
		
		//to convert string to int
		String number = "12345";
		
		int temp = Integer.parseInt(number);
		float f = Float.parseFloat(number);
		
		System.out.println(temp+20);
		System.out.println(f+20);
		
		Integer num = 20;
		System.out.println(num+30);
		
		System.out.println(num.intValue());
	}
}
