package looping;

import java.util.Scanner;

public class task_4 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int choice;
	
				System.out.println("1. right triangle\n2. left triangle\n3. pyramid program\n4. downward triagle\n5. right triangle ");
				System.out.print("Enter choice= ");
				choice = scanner.nextInt();
				
				switch(choice)
				{
				case 1:
						
						for(int i=1; i<=5; i++)
						{
							for(int j=1; j<=i; j++)
							{
								System.out.print("*");
							}
							System.out.println();
						}
						break;
				
				case 2:
					
						for(int i=1; i<=5; i++)
						{
							for(int j=5; j>i; j--)
							{
								System.out.print(" ");
							}
							for(int k=1; k<=i; k++)
							{
								System.out.print("*");
							}
							System.out.println();
						}
						break;
						
				case 3:
					
						for(int i=1; i<=5; i++)
						{
							for(int j=5; j>=i; j--)
							{
								System.out.print(" ");
							}
							
							for(int k=1; k<=i; k++)
							{
								System.out.print("* ");
							}
							System.out.println();
						}
						break;
						
				case 4:
					
						for(int i=5; i>=1; i--)
						{
							for(int j=1; j<=i; j++)
							{
								System.out.print("*" + " ");
							}
							System.out.println();
						}
						break;
						
				case 5:
					
						for(int i=5; i>=1; i--)
						{
							for(int j=5; j>i; j--)
							{
								System.out.print(" ");
							}
							for(int k=1; k<=i; k++)
							{
								System.out.print("*");
							}
							System.out.println();
						}
						break;
						
				default:
						System.out.println("Invalid Input");
						
				
				}
			
		}
}
