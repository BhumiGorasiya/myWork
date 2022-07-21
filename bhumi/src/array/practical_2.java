package array;

import java.util.Scanner;

// WAP to print addition of 5 array elements using input

public class practical_2 {
	
	public static void main(String[] args) {
		
			int values[] = new int[5];
			Scanner scanner = new Scanner(System.in);
			int sum = 0;
			
			for(int i = 0; i<values.length; i++)
			{
				System.out.print("enter value at index "+i+" : ");
				values[i] = scanner.nextInt();
				
				sum = sum+values[i];
			}
			
			System.out.println("addition of array elements : "+sum);
		
		
	}

}
