package assignments;
//WAP to demonstrate try catch block.

public class Practical_18 {
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Program start");
			int num[] = {23,36,16,78,32,96};
			System.out.println("Value at index-7 : "+num[2]);
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException handled");
		
		}
	}
}
