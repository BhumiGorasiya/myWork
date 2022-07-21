package function;

import java.util.Scanner;

public class task_9 {
	
	public static void main(String[] args) {
		
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Value : ");
		a = scanner.nextInt();
		
		System.out.println("Area of pantagon :"+findArea(a));
		

	}
	
	static float findArea(float B)
	{
		float area;
		
		area = (float)(Math.sqrt(5*(5+2*(5))))* a* a)/4;
		
		return area;
	}
	
	}
	


