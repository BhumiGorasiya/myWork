package looping;

import java.util.Scanner;

//WAP that prompts the user to input a positive integer.it should then print the multiplication table of that number.
public class practice_3 {

		public static void main(String[] args) {
			
			int i;
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter positive number : ");
			i = scanner.nextInt(); 
			
			if(i>0)
			{
					
					for(int j = 1; j<=10;j++)
					{
							System.out.println(i*j);
					}
			}else {
					System.out.print("Please enter positive number");
			}
		}
}
