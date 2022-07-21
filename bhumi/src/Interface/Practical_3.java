package Interface;

interface I1{
	
	void show();
}

interface I2{
	
	void display();
	void show();
}

class Test implements I1, I2{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method called");
		
		}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method called");
		
	}
}

public class Practical_3 { 
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.display();
		t1.show();
		
	}

}
