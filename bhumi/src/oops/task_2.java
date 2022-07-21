package oops;

class findArea
{
	int beadth;
	int length;
	int area;
	int A;
	
	void Area(int a, int b)
	{
		beadth = a;
		length = b;
		
		area = a*b;
		System.out.println("Area of rectangle "+area);
	}
	
	void Area(int S)
	{
		A=S;
		area = S*S;
		System.out.println("Area of square "+area);
	}
}


public class task_2 {
public static void main(String[] args) {
	
	
	findArea f1 = new findArea();
	f1.Area(10,5);
	
	findArea f2 = new findArea();
	f2.Area(10);
	
}
}
