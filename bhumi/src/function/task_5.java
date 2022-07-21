package function;

import java.util.Scanner;

//Write a Java method to compute the sum of the digits in an integer. Go to the editor
// without return type and without parameter

public class task_5 {
	
	public static void main(String[] args) {
		
		summation();
		
	}
  
	
	static void summation()
	{
		int a, b, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the elements: ");
		a = scanner.nextInt();
		
		while(a > 0)
		{
			b = a % 10;
			sum = sum + b;
			a = a / 10;
		}
		
		System.out.println("sum of numbers : "+sum);
	}
}   
