package Encapsulation;

class Area{
	
	private int length;
	private int breadth;
	 
	Area(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() 
	{
		int area = length*breadth;
		System.out.println("Area :"+area);
	}
}

public class Practical_1 {
	public static void main(String[] args) {
		
		Area a1 = new Area(20,23);
		a1.getArea();
	}

}
