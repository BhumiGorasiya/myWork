package function;

//WAP without return Type and without parameter

import java.util.Scanner;

public class practical_1 {
	
	public static void main(String[] args) {
		
		System.out.println("program stats from here");
		
		addition();									//function calling
		
		System.out.println("program ends");
		addition();
		addition();
		
	}
	
	static void addition()							// function declaration
	{
			
			int num1, num2;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter value of num1: ");
			num1 = scanner.nextInt();
			System.out.print("Enter value of num2: ");
			num2 = scanner.nextInt();
			
			int sum = num1+num2;
			
			System.out.println("summation :"+sum);
			
			
	}

}
