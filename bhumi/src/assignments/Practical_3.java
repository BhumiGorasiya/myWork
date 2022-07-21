package assignments;

import java.util.Scanner;

//• W.A.J.P to find factorial for Given Number. 

public class Practical_3 {

	public static void main(String[] args) {
		
		int fact = factorial();
		System.out.println("factorial (main fuction) : "+fact);
		
	}
	
	
	static int factorial()
	{
	
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter number = ");
	int num = scanner.nextInt();
	
	int fact = 1;
	
	for(int i = 1; i<=num; i++)
	{
		fact = fact*i;
	}
	
	return fact;
	}
	
	
	
}
