package bhumi;

import java.util.Scanner;

public class Practice_4 {
	
	public static void main(String[] args) {
		
			int choice, num1, num2;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter value of num1 = ");
			num1 = scanner.nextInt();
			
			System.out.print("Enter value of num2 = ");
			num2 = scanner.nextInt();
			
			System.out.println("1. Addition\n2. Multiplicatin\n3. Subtraction\n4. Division");
			System.out.print("Enter choice : ");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
					System.out.println("Additiona : "+(num1+num2));
					break;
			case 2:
					System.out.println("Multiplication : "+(num1*num2));
					break;
			case 3:
					System.out.println("Subtraction : "+(num1-num2));
					break;
			case 4:
					System.out.println("Division : "+(num1/num2));
					break;
			default:
					System.out.println("Invalid Input");
			}
	}

}
