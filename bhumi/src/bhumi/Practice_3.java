package bhumi;

import java.util.Scanner;

// user input
public class Practice_3 {
	
	public static void main(String[] args) {
		
		int  num1;
		int  num2;
		
		Scanner scanner = new Scanner (System.in);
				
		System.out.print("Enter value of num1 = ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter value of num2 = ");
		num2 = scanner.nextInt();
		
		System.out.println("addition = "+(num1+num2));
		
		System.out.println("substraction = "+(num1-num2));
	}

}
