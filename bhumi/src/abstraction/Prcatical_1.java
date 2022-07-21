package abstraction;

// Abstract class
abstract class Shape{
	
		private float dimen;
		
		void setData(float dimen)
		{
			this.dimen = dimen;
		}
		
		float getDimen()
		{
			return dimen();
		}
		
		
		abstract void area();     //abstract method
		
}

class Circle extends Shape{
	@Override
	void area() {
		
			float dimen = getDimen();
			float area = (float)(3.14*dimen*dimen);
			System.out.println("Area of circle : "+area);
		
	}
}

class Square extends Shape{
	@Override
	void area() {
		
			float dimen = getDimen();
			float area = (float)(dimen*dimen);
			System.out.println("Area of square : "+area );
		
	}
	
	
}
public class Prcatical_1 {
public static void main(String[] args) {
	
		Circle c1 = new Circle();
		c1.setData(23.4f);
		
		Square s1 = new Square();
		s1.setData(12.4f);
		
		c1.area();
		s1.area();
	
	
	
		
}
}
