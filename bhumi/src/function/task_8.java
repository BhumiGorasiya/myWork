package function;

import java.util.Scanner;

//Write Java methods to calculate the area of a triangle. Go to the editor

public class task_8 {
	public static void main(String[] args) {
		
		int side1, side2, side3;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter side1 :");  
		side1 = scanner.nextInt();
		
		System.out.print("enter side2 :");
		side2 = scanner.nextInt();
		
		System.out.print("enter side3 :");
		side3 = scanner.nextInt();
		
		int p = perimeter(side1, side2, side3);
		System.out.println("perimeter of triangle :"+p);
		
		float s = semiPerimeter(p);
		System.out.println("semi-perimeter pf triangle :"+s);
		
		double area = area(side1, side2, side3, s);
		System.out.println("area of triangle :"+area);
		
		
	}

	static int perimeter(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	
	static float semiPerimeter(int p)
	{
		return (float)p/2;
	}
	
	static double area(int a, int b, int c, float s)
	{
		double d = (s*(s-a)*(s-b)*(s-c));
		
		return Math.sqrt(d);
	}
	
	
}
